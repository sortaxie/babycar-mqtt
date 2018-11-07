package com.adorgroup.babycar.mqtt;

import com.adorgroup.babycar.mqtt.domain.DeviceItemOrder;
import com.adorgroup.babycar.mqtt.service.DeviceItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @Autowired
    private DeviceItemOrderService  deviceItemOrderService;

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

    @RequestMapping("clearing")
    public void clearing()
    {
        deviceItemOrderService.clearingDeviceItemOrder("4cd5");
    }
}
