package com.adorgroup.babycar.mqtt;

import com.adorgroup.babycar.mqtt.common.CommandType;
import com.adorgroup.babycar.mqtt.domain.enums.StationStatus;
import com.adorgroup.babycar.mqtt.service.OrderService;
import com.adorgroup.babycar.mqtt.service.StationService;
import com.adorgroup.babycar.mqtt.task.ChangeStationStatusTask;
import com.adorgroup.babycar.mqtt.task.ClearingTask;
import com.adorgroup.babycar.mqtt.util.ThreadPoolManager;
import com.adorgroup.framework.common.MessageDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

import java.io.IOException;
import java.util.Date;

@Configuration
@IntegrationComponentScan
public class MqttReceiveConfig {

    private static Logger log = LoggerFactory.getLogger(MqttReceiveConfig.class);

    @Autowired
    private MqttGateway mqttGateway;
    @Value("${adorgroup.mqtt.username}")
    private String username;
    @Value("${adorgroup.mqtt.password}")
    private String password;
    @Value("${adorgroup.mqtt.url}")
    private String hostUrl;
    @Value("${adorgroup.mqtt.client.receive.id}")
    private String clientId;
    @Value("${adorgroup.mqtt.completionTimeout}")
    private int completionTimeout ;   //连接超时
    @Value("${adorgroup.mqtt.productId}")
    private String productId;

    private static  int count = 0;

    @Autowired
    private OrderService orderService;
    @Autowired
    private StationService stationService;
    @Bean
    public MqttConnectOptions getMqttConnectOptions(){

        MqttConnectOptions mqttConnectOptions=new MqttConnectOptions();
        mqttConnectOptions.setUserName(username);
        mqttConnectOptions.setPassword(password.toCharArray());
        mqttConnectOptions.setServerURIs(new String[]{hostUrl});
        mqttConnectOptions.setKeepAliveInterval(60);
        return mqttConnectOptions;
    }
    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        factory.setConnectionOptions(getMqttConnectOptions());
        return factory;
    }

    //接收通道
    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }

    //配置client,监听的topic
    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(clientId+"_inbound", mqttClientFactory(),
                        "in/#","out/"+productId+"/#","off/"+productId+"/#");
        adapter.setCompletionTimeout(completionTimeout);
        adapter.setConverter(new DefaultPahoMessageConverter());
       // adapter.setQos(1,1,2);
        //adapter.setQos(2);
        adapter.setOutputChannel(mqttInputChannel());

        return adapter;
    }

    //通过通道获取数据
    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler() {
        return new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {
                String topic = message.getHeaders().get("mqtt_topic").toString();
                String qos = message.getHeaders().get("mqtt_qos").toString();
                log.info(new Date().toString());
                log.info("qos:"+qos);
                log.info(topic+":"+message.getPayload().toString());
                if(topic.indexOf("in/")>-1){
                    //log.info(topic+":"+message.getPayload().toString());
                }else if(topic.indexOf("out/"+productId+"/")>-1){
                    //锁上报消息，下发给设备

                    String data =  message.getPayload().toString();
                    ObjectMapper mapper = new ObjectMapper();
                    try {
                        MessageDto messageDto =  mapper.readValue(data, MessageDto.class);
                        if(CommandType.RETURN_CAR.equals(messageDto.getType())) {
                             //闭锁 还车上报
                          ThreadPoolManager.newInstance().addExecuteTask(new ClearingTask(messageDto,orderService,productId,mqttGateway));
                        }else if(CommandType.ONLINE.equals(messageDto.getType())){
                            //设备上线
                            ThreadPoolManager.newInstance().addExecuteTask((new ChangeStationStatusTask(messageDto.getOid(), StationStatus.ONLINE.ordinal(),stationService)));
                        }
                    } catch (IOException e) {
                        log.error("out errer:",e);
                    }
                }else if(!topic.equals("off/"+productId+"/#")&&topic.indexOf("off/"+productId+"/")>-1){
                    //设备下线
                    ThreadPoolManager.newInstance().addExecuteTask((new ChangeStationStatusTask(message.getPayload().toString(), StationStatus.OFFLINE.ordinal(),stationService)));
                }
            }
        };
    }
}
