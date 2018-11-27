package com.adorgroup.babycar.mqtt.service;

public interface OrderService {
    /**
     * 结算订单
     * @param rfid
     * @return
     */
    boolean clearingOrder(String rfid);

    /**
     * 车辆解锁
     * @param rfid
     * @return
     */
    boolean unlock(String rfid);
}
