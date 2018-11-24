package com.adorgroup.babycar.mqtt.controller;

import com.adorgroup.babycar.mqtt.MessageDto;
import com.adorgroup.babycar.mqtt.MqttGateway;
import com.adorgroup.babycar.mqtt.util.CRCUtil;
import com.adorgroup.babycar.mqtt.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class SendController {

    @Autowired
    private MqttGateway mqttGateway;

    @Value("${adorgroup.mqtt.productId}")
    private String productId;

    @PostMapping("sendToLock")
    public String  sendToLock(@RequestBody MessageDto messageDto){
        String json = JacksonUtil.toJson(messageDto);
        String crc =Integer.toHexString(CRCUtil.CRC16Ccitt(json.replace("}",",").getBytes())) ;
        messageDto.setCrc(crc);
        String sendJson = JacksonUtil.toJson(messageDto);
        mqttGateway.sendToMqtt(sendJson,"in/"+productId+"/"+messageDto.getOid());

        return "ok";
    }

}
