package com.adorgroup.babycar.mqtt.service;

import com.adorgroup.framework.common.MessageDto;

public interface OrderService {
    /**
     * 结算订单
     * @param messageDto
     * @return 订单的用户Id
     */
    Integer clearingOrder(MessageDto messageDto);

    /**
     * 车辆解锁
     * @param rfid
     * @return
     */
    boolean unlock(String rfid);


}
