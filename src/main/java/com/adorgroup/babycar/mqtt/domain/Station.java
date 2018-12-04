package com.adorgroup.babycar.mqtt.domain;

import java.util.Date;

public class Station {
    private String id;

    private String remark;

    private Integer status;

    private Date intime;

    private Date worktime;

    private String address;

    private String name;

    private Double gprsLng;

    private Double gprsLat;

    private Double baiduLng;

    private Double baiduLat;

    private Double tencentLng;

    private Double tencentLat;

    private Integer frnId;

    private Double unitPrice;

    private Double priceInterval;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getGprsLng() {
        return gprsLng;
    }

    public void setGprsLng(Double gprsLng) {
        this.gprsLng = gprsLng;
    }

    public Double getGprsLat() {
        return gprsLat;
    }

    public void setGprsLat(Double gprsLat) {
        this.gprsLat = gprsLat;
    }

    public Double getBaiduLng() {
        return baiduLng;
    }

    public void setBaiduLng(Double baiduLng) {
        this.baiduLng = baiduLng;
    }

    public Double getBaiduLat() {
        return baiduLat;
    }

    public void setBaiduLat(Double baiduLat) {
        this.baiduLat = baiduLat;
    }

    public Double getTencentLng() {
        return tencentLng;
    }

    public void setTencentLng(Double tencentLng) {
        this.tencentLng = tencentLng;
    }

    public Double getTencentLat() {
        return tencentLat;
    }

    public void setTencentLat(Double tencentLat) {
        this.tencentLat = tencentLat;
    }

    public Integer getFrnId() {
        return frnId;
    }

    public void setFrnId(Integer frnId) {
        this.frnId = frnId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getPriceInterval() {
        return priceInterval;
    }

    public void setPriceInterval(Double priceInterval) {
        this.priceInterval = priceInterval;
    }
}