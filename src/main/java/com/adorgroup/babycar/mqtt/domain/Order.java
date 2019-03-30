package com.adorgroup.babycar.mqtt.domain;

import java.util.Date;

public class Order {
    private Long id;

    private Integer frnId;

    private String orderNum;

    private String stationId;

    private Integer frnStationId;

    private Double stationCommission;

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

    private Integer sttStatus;

    private Integer type;

    private String returnStationId;

    private String expression;

    private String expressionRemark;

    private Long minimumTerm;

    private String duration;

    private Integer unitPriceType;

    private Double deposit;

    private String mainOrderNumber;

    private Integer orderType;

    private Double freight;

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

    public Double getStationCommission() {
        return stationCommission;
    }

    public void setStationCommission(Double stationCommission) {
        this.stationCommission = stationCommission;
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

    public Integer getSttStatus() {
        return sttStatus;
    }

    public void setSttStatus(Integer sttStatus) {
        this.sttStatus = sttStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReturnStationId() {
        return returnStationId;
    }

    public void setReturnStationId(String returnStationId) {
        this.returnStationId = returnStationId == null ? null : returnStationId.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getExpressionRemark() {
        return expressionRemark;
    }

    public void setExpressionRemark(String expressionRemark) {
        this.expressionRemark = expressionRemark == null ? null : expressionRemark.trim();
    }

    public Long getMinimumTerm() {
        return minimumTerm;
    }

    public void setMinimumTerm(Long minimumTerm) {
        this.minimumTerm = minimumTerm;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public Integer getUnitPriceType() {
        return unitPriceType;
    }

    public void setUnitPriceType(Integer unitPriceType) {
        this.unitPriceType = unitPriceType;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getMainOrderNumber() {
        return mainOrderNumber;
    }

    public void setMainOrderNumber(String mainOrderNumber) {
        this.mainOrderNumber = mainOrderNumber == null ? null : mainOrderNumber.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }
}