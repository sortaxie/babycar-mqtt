package com.adorgroup.babycar.mqtt.domain;

import java.math.BigDecimal;

public class MallAgentSet {
    private Integer id;

    private Integer step;

    private BigDecimal flrate1;

    private BigDecimal flrate2;

    private Integer flrate3;

    private Integer txlimit;

    private Integer stat;

    private String adimg;

    private String adtext;

    private Integer time;

    private Integer beforeTime;

    private Integer unitPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public BigDecimal getFlrate1() {
        return flrate1;
    }

    public void setFlrate1(BigDecimal flrate1) {
        this.flrate1 = flrate1;
    }

    public BigDecimal getFlrate2() {
        return flrate2;
    }

    public void setFlrate2(BigDecimal flrate2) {
        this.flrate2 = flrate2;
    }

    public Integer getFlrate3() {
        return flrate3;
    }

    public void setFlrate3(Integer flrate3) {
        this.flrate3 = flrate3;
    }

    public Integer getTxlimit() {
        return txlimit;
    }

    public void setTxlimit(Integer txlimit) {
        this.txlimit = txlimit;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getAdimg() {
        return adimg;
    }

    public void setAdimg(String adimg) {
        this.adimg = adimg == null ? null : adimg.trim();
    }

    public String getAdtext() {
        return adtext;
    }

    public void setAdtext(String adtext) {
        this.adtext = adtext == null ? null : adtext.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getBeforeTime() {
        return beforeTime;
    }

    public void setBeforeTime(Integer beforeTime) {
        this.beforeTime = beforeTime;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
}