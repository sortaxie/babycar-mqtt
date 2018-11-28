package com.adorgroup.babycar.mqtt.domain.enums;

public enum StationStatus {

    NOACTIVATE(0),OFFLINE(1),ONLINE(2),LOCKED(3);

    private int value;
    StationStatus(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
