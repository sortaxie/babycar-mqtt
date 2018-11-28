package com.adorgroup.babycar.mqtt.domain.enums;

public enum OrderStatus {
    INVALID(-1),PRE(0),START(1),END(2);
    private  int value;
    OrderStatus(int value){
         this.value = value;
    }

    public int getValue() {
        return value;
    }
}
