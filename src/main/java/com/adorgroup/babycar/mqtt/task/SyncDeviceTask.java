package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.service.DeviceService;
import com.adorgroup.framework.common.MessageDto;

/**
 *  同步设备任务
 */
public class SyncDeviceTask extends BaseTask {


    private DeviceService deviceService;

    public SyncDeviceTask(MessageDto messageDto, DeviceService deviceService){
        super(messageDto);
        this.deviceService = deviceService;
    }

    public  void  run() {
        deviceService.syncDevices(messageDto);
    }
}
