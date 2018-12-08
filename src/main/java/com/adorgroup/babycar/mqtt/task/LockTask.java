package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.MqttGateway;
import com.adorgroup.babycar.mqtt.service.OrderService;
import com.adorgroup.babycar.mqtt.util.MessageDtoUtil;
import com.adorgroup.framework.common.MessageDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  闭锁任务
 */
public class LockTask extends BaseTask {
    private static Logger log = LoggerFactory.getLogger(LockTask.class);
    private OrderService orderService;
    private String productId;
    private MqttGateway mqttGateway;
    public LockTask(MessageDto messageDto, OrderService orderService, String productId, MqttGateway mqttGateway) {
        super(messageDto);
        this.orderService = orderService;
        this.productId = productId;
        this.mqttGateway = mqttGateway;
    }

    public  void  run() {
        MessageDtoUtil.setKrValue(messageDto);
        if (orderService.clearingOrder(messageDto)) {
            String result = null;
            String rfid = messageDto.getKr();
            try {
                messageDto.setKr(null);
                ObjectMapper mapper = new ObjectMapper();
                result = mapper.writeValueAsString(messageDto);
            } catch (JsonProcessingException e) {
                log.error("out errer:", e);
            }
            String sendTopic = "lock/" + productId + "/" + rfid;
            log.info("topic:" + sendTopic);
            mqttGateway.sendToMqtt(result, sendTopic);
        }else{
            log.error("return car error rfid:"+messageDto.getKr() +" stationId:"+messageDto.getOid());
        }

    }
}
