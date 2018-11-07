package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.DeviceMapper;
import com.adorgroup.babycar.mqtt.domain.Device;
import com.adorgroup.babycar.mqtt.domain.DeviceKey;
import com.adorgroup.babycar.mqtt.domain.enums.DeviceStat;
import com.adorgroup.babycar.mqtt.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Value("${adorgroup.mqtt.productId}")
    private String productId;

    @Override
    public void changeDeviceStat(String deviceId, int stat) {
        DeviceKey deviceKey = new DeviceKey();
        deviceKey.setId(deviceId);
        deviceKey.setPid(productId);
        Device device  = deviceMapper.selectByPrimaryKey(deviceKey);
        if(device.getStat()!=DeviceStat.LOCKED.ordinal()) {
            if (device.getStat() == DeviceStat.NOACTIVATE.ordinal()) {
                //如果是未激活状态，新增激活时间
                device.setWorktime(new Date());
            }
            if (device.getStat() != stat) {
                device.setStat(stat);
                deviceMapper.updateByPrimaryKeySelective(device);
            }
        }
    }
}
