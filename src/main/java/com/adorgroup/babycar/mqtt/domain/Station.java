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

    private Integer type;

    private Double commission;

    private String bannerImages;

    private String mobile;

    private String contact;

    private String headerImage;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getBannerImages() {
        return bannerImages;
    }

    public void setBannerImages(String bannerImages) {
        this.bannerImages = bannerImages == null ? null : bannerImages.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage == null ? null : headerImage.trim();
    }
}