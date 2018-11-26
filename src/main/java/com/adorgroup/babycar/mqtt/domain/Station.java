package com.adorgroup.babycar.mqtt.domain;

import java.util.Date;

public class Station {
    private String id;

    private String sn;

    private String wxdid;

    private String qrticket;

    private String remark;

    private Integer status;

    private Date intime;

    private Date worktime;

    private Date starttime;

    private Date exptime;

    private Integer mallId;

    private Integer useid;

    private String qrcode;

    private String noid;

    private String address;

    private String pname;

    private Integer skstat;

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getWxdid() {
        return wxdid;
    }

    public void setWxdid(String wxdid) {
        this.wxdid = wxdid == null ? null : wxdid.trim();
    }

    public String getQrticket() {
        return qrticket;
    }

    public void setQrticket(String qrticket) {
        this.qrticket = qrticket == null ? null : qrticket.trim();
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getExptime() {
        return exptime;
    }

    public void setExptime(Date exptime) {
        this.exptime = exptime;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public Integer getUseid() {
        return useid;
    }

    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid == null ? null : noid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getSkstat() {
        return skstat;
    }

    public void setSkstat(Integer skstat) {
        this.skstat = skstat;
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