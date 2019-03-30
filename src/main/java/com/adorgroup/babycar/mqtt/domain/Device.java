package com.adorgroup.babycar.mqtt.domain;

import java.util.Date;

public class Device {
    private Integer id;

    private String rfid;

    private Integer productId;

    private Integer frnId;

    private Double unitPrice;

    private Double priceInterval;

    private String stationId;

    private Integer stationKs;

    private Date createTime;

    private Date modifyTime;

    private Integer status;

    private Integer type;

    private String expression;

    private String expressionRemark;

    private Long minimumTerm;

    private Integer frequency;

    private Integer unitPriceType;

    private Double minPrice;

    private String productName;

    private Integer deliveryMethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public Integer getStationKs() {
        return stationKs;
    }

    public void setStationKs(Integer stationKs) {
        this.stationKs = stationKs;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getUnitPriceType() {
        return unitPriceType;
    }

    public void setUnitPriceType(Integer unitPriceType) {
        this.unitPriceType = unitPriceType;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(Integer deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}