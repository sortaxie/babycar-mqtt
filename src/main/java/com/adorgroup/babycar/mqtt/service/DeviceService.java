package com.adorgroup.babycar.mqtt.service;

public interface DeviceService {
    /**
     * 修改设备 状态
     * @param deviceId
     * @param stat
     */
    public void changeDeviceStat(String deviceId,int stat);
}
