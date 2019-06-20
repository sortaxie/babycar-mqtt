package com.adorgroup.babycar.mqtt.domain.enums;

public enum OrderPayStatus {
    //未支付
    UNPAID(0),
    //已支付
    PAID(1);
    private Integer value;

    OrderPayStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
