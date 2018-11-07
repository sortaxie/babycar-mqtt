package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangeDeviceStatTask extends Thread {

    @Autowired
    private DeviceService deviceService;

    private String deviceId;
    private int stat;

    public ChangeDeviceStatTask(String deviceId,int stat, DeviceService deviceService) {
        this.deviceId = deviceId;
        this.deviceService = deviceService;
        this.stat = stat;
    }



    public void run(){
        deviceService.changeDeviceStat(deviceId,stat);
    }



}
