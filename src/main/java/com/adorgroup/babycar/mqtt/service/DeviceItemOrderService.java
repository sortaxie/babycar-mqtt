package com.adorgroup.babycar.mqtt.service;


public interface DeviceItemOrderService {

    /**
     * 订单清算
     * @param carId
     * @return
     */
    boolean clearingDeviceItemOrder(String carId);
}
