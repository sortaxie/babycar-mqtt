package com.adorgroup.babycar.mqtt.service;

import com.adorgroup.framework.common.MessageDto;

public interface DeviceService {
    /**
     *  修改设备相关属性
     * @param messageDto
     */
     boolean updateDevice(MessageDto messageDto);
}
