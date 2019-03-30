package com.adorgroup.babycar.mqtt;

import com.adorgroup.babycar.mqtt.common.CommandType;
import com.adorgroup.babycar.mqtt.util.JacksonUtil;
import com.adorgroup.framework.common.MessageDto;
import com.adorgroup.framework.common.pojo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @Value("${adorgroup.mqtt.productId}")
    private String productId;

    @RequestMapping("send")
    public void send(){
        for(int i=1;i<=20;i++) {
            String data = "{\"type\":\"171\",\"oid\":\"00000010"+i+"\",\"kr1\":\"727f\"}";

            mqttGateway.sendToMqtt(data, "out/d0b75ae9f72a9665/00000010");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("lock")
    public BaseResponse lock(){
        MessageDto messageDto = new MessageDto();
        messageDto.setType(CommandType.LOCK);
        messageDto.setKs1("0");
        messageDto.setKr1("1000000479681679"); //rfid
        messageDto.setOid("0000002"); //站点id
        String sendJson = JacksonUtil.toJson(messageDto);
        mqttGateway.sendToMqtt(sendJson,"out/" + productId + "/" + messageDto.getOid());
        return new BaseResponse();
    }


}
