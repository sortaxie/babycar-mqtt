package com.adorgroup.babycar.mqtt.domain.enums;

/**
 * @ClassName OrderPriceType
 * @Description
 * @Author 熊俊堡
 * @Date 2019/3/6 0006 下午 2:22
 */
public enum OrderPriceType {
    HOUR(1),
    DAY(2);

    private int value;

    OrderPriceType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
