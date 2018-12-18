package com.adorgroup.babycar.mqtt.controller;

import com.adorgroup.babycar.mqtt.MqttGateway;
import com.adorgroup.babycar.mqtt.util.CRCUtil;
import com.adorgroup.babycar.mqtt.util.JacksonUtil;
import com.adorgroup.framework.common.MessageDto;
import com.adorgroup.framework.common.pojo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class SendController {

//    private static Logger log = LoggerFactory.getLogger(SendController.class);

    @Autowired
    private MqttGateway mqttGateway;

    @Value("${adorgroup.mqtt.productId}")
    private String productId;

    @RequestMapping(value="sendToLock",method =  RequestMethod.POST)
    public BaseResponse sendToLock(@RequestBody MessageDto messageDto){
        BaseResponse response = new BaseResponse();
        String json = JacksonUtil.toJson(messageDto);
        String crc = Integer.toHexString(CRCUtil.CRC16Ccitt(json.replace("}", ",").getBytes()));
        messageDto.setCrc(crc);
        String sendJson = JacksonUtil.toJson(messageDto);
        mqttGateway.sendToMqtt(sendJson, "in/" + productId + "/" + messageDto.getOid());
        return response;

    }

}
