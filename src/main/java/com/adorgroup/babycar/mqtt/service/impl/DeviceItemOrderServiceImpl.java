package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.DeviceItemOrderMapper;
import com.adorgroup.babycar.mqtt.dao.MallAgentSetMapper;
import com.adorgroup.babycar.mqtt.domain.DeviceItemOrder;
import com.adorgroup.babycar.mqtt.domain.MallAgentSet;
import com.adorgroup.babycar.mqtt.service.DeviceItemOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DeviceItemOrderServiceImpl implements DeviceItemOrderService {

    private static Logger log = LoggerFactory.getLogger(DeviceItemOrderServiceImpl.class);

    @Autowired
    DeviceItemOrderMapper deviceItemOrderMapper;
    @Autowired
    MallAgentSetMapper mallAgentSetMapper;

    @Override
    public boolean clearingDeviceItemOrder(String carId) {
        DeviceItemOrder deviceItemOrder =  deviceItemOrderMapper.getClearingOrder(carId);
        if(deviceItemOrder!=null){
            MallAgentSet mallAgentSet =  mallAgentSetMapper.selectByPrimaryKey(35);
            Date endTimer = new Date();
            Integer price =   mallAgentSet.getUnitPrice();
            Integer tim = (int) (endTimer.getTime() - deviceItemOrder.getStartimer().getTime()) / 1000;
            int timss = (tim / 3600) + 1;
            Double moneys = (double) (price * timss);
            DeviceItemOrder newDeviceItemOrder = new DeviceItemOrder();
            newDeviceItemOrder.setId(deviceItemOrder.getId());
            newDeviceItemOrder.setStat(3);
            newDeviceItemOrder.setMoneys(moneys.toString());
            newDeviceItemOrder.setEndtimer(endTimer);
            deviceItemOrderMapper.updateByPrimaryKeySelective(newDeviceItemOrder);

            return true;
        }


        return false;
    }
}
