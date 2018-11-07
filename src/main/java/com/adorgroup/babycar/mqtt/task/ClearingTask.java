package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.MessageDto;
import com.adorgroup.babycar.mqtt.MqttGateway;
import com.adorgroup.babycar.mqtt.service.DeviceItemOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClearingTask extends BaseTask {
    private static Logger log = LoggerFactory.getLogger(ClearingTask.class);
    private DeviceItemOrderService deviceItemOrderService;
    private String productId;
    private MqttGateway mqttGateway;
    public ClearingTask(MessageDto messageDto,DeviceItemOrderService deviceItemOrderService,String productId,MqttGateway mqttGateway) {
        super(messageDto);
        this.deviceItemOrderService = deviceItemOrderService;
        this.productId = productId;
        this.mqttGateway = mqttGateway;
    }


    public  void  run() {
        if (messageDto.getKr1() != null) {
            messageDto.setKr(messageDto.getKr1());
        } else if (messageDto.getKr2() != null) {
            messageDto.setKr(messageDto.getKr2());
        } else if (messageDto.getKr3() != null) {
            messageDto.setKr(messageDto.getKr3());
        } else if (messageDto.getKr4() != null) {
            messageDto.setKr(messageDto.getKr4());
        } else if (messageDto.getKr5() != null) {
            messageDto.setKr(messageDto.getKr5());
        } else if (messageDto.getKr6() != null) {
            messageDto.setKr(messageDto.getKr6());
        } else if (messageDto.getKr7() != null) {
            messageDto.setKr(messageDto.getKr7());
        } else if (messageDto.getKr8() != null) {
            messageDto.setKr(messageDto.getKr8());
        }
        if (deviceItemOrderService.clearingDeviceItemOrder(messageDto.getKr())) {
            String result = null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                result = mapper.writeValueAsString(messageDto);
            } catch (JsonProcessingException e) {
                log.error("out errer:", e);
            }
            String sendTopic = "lock/" + productId + "/" + messageDto.getKr();
            log.info("topic:" + sendTopic);
            mqttGateway.sendToMqtt(result, sendTopic);

        }else{
            log.error("return car error rfid:"+messageDto.getKr() +" deviceId:"+messageDto.getOid());
        }

    }
}
