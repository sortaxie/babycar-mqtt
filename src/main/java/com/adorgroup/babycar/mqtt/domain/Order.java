package com.adorgroup.babycar.mqtt.domain;

import java.util.Date;

public class Order {
    private Long id;

    private Integer frnId;

    private String orderNum;

    private String stationId;

    private Integer frnStationId;

    private Double stationUnitPrice;

    private Double stationPriceInterval;

    private Double stationMoney;

    private String rfid;

    private Integer frnDeviceId;

    private Double deviceUnitPrice;

    private Double devicePriceInterval;

    private Double deviceMoney;

    private Integer userId;

    private Date startTime;

    private Date endTime;

    private Double moneys;

    private Date payTime;

    private Integer status;

    private Integer payType;

    private Integer payStatus;

    private Integer invoiceState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFrnId() {
        return frnId;
    }

    public void setFrnId(Integer frnId) {
        this.frnId = frnId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public Integer getFrnStationId() {
        return frnStationId;
    }

    public void setFrnStationId(Integer frnStationId) {
        this.frnStationId = frnStationId;
    }

    public Double getStationUnitPrice() {
        return stationUnitPrice;
    }

    public void setStationUnitPrice(Double stationUnitPrice) {
        this.stationUnitPrice = stationUnitPrice;
    }

    public Double getStationPriceInterval() {
        return stationPriceInterval;
    }

    public void setStationPriceInterval(Double stationPriceInterval) {
        this.stationPriceInterval = stationPriceInterval;
    }

    public Double getStationMoney() {
        return stationMoney;
    }

    public void setStationMoney(Double stationMoney) {
        this.stationMoney = stationMoney;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Integer getFrnDeviceId() {
        return frnDeviceId;
    }

    public void setFrnDeviceId(Integer frnDeviceId) {
        this.frnDeviceId = frnDeviceId;
    }

    public Double getDeviceUnitPrice() {
        return deviceUnitPrice;
    }

    public void setDeviceUnitPrice(Double deviceUnitPrice) {
        this.deviceUnitPrice = deviceUnitPrice;
    }

    public Double getDevicePriceInterval() {
        return devicePriceInterval;
    }

    public void setDevicePriceInterval(Double devicePriceInterval) {
        this.devicePriceInterval = devicePriceInterval;
    }

    public Double getDeviceMoney() {
        return deviceMoney;
    }

    public void setDeviceMoney(Double deviceMoney) {
        this.deviceMoney = deviceMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getMoneys() {
        return moneys;
    }

    public void setMoneys(Double moneys) {
        this.moneys = moneys;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(Integer invoiceState) {
        this.invoiceState = invoiceState;
    }
}