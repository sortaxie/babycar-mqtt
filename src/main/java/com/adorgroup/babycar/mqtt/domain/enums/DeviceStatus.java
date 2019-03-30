package com.adorgroup.babycar.mqtt.domain.enums;

public enum DeviceStatus {
    DELETE(-1),AVAILABLE(0),USING(1),REPAIR(2),LOCKED(3),SOLD(4);

    private int value;

    DeviceStatus(int value){
        this.value =value;
    }

    public int getValue() {
        return value;
    }
}
