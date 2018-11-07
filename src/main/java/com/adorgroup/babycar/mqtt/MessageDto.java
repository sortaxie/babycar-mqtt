package com.adorgroup.babycar.mqtt;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDto {
    private String type;
    private String oid;
    private String res;
    private String mode;
    private String user;
    private String password;
    private String server;
    private String path;
    private String file;
    private String nid;
    private String lock;
    private String error;
    private String port;
    private String beat;
    private String mac;
    private String name;
    private String batt;
    private String lon;
    private String lonVal;
    private String ks1;
    private String ks2;
    private String ks3;
    private String ks4;
    private String ks5;
    private String ks6;
    private String ks7;
    private String ks8;
    private String kr;
    private String kr1;
    private String kr2;
    private String kr3;
    private String kr4;
    private String kr5;
    private String kr6;
    private String kr7;
    private String kr8;
    private String crc;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatt() {
        return batt;
    }

    public void setBatt(String batt) {
        this.batt = batt;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLonVal() {
        return lonVal;
    }

    public void setLonVal(String lonVal) {
        this.lonVal = lonVal;
    }

    public String getKs1() {
        return ks1;
    }

    public void setKs1(String ks1) {
        this.ks1 = ks1;
    }

    public String getKs2() {
        return ks2;
    }

    public void setKs2(String ks2) {
        this.ks2 = ks2;
    }

    public String getKs3() {
        return ks3;
    }

    public void setKs3(String ks3) {
        this.ks3 = ks3;
    }

    public String getKs4() {
        return ks4;
    }

    public void setKs4(String ks4) {
        this.ks4 = ks4;
    }

    public String getKs5() {
        return ks5;
    }

    public void setKs5(String ks5) {
        this.ks5 = ks5;
    }

    public String getKs6() {
        return ks6;
    }

    public void setKs6(String ks6) {
        this.ks6 = ks6;
    }

    public String getKs7() {
        return ks7;
    }

    public void setKs7(String ks7) {
        this.ks7 = ks7;
    }

    public String getKs8() {
        return ks8;
    }

    public void setKs8(String ks8) {
        this.ks8 = ks8;
    }

    public String getKr() {
        return kr;
    }

    public void setKr(String kr) {
        this.kr = kr;
    }

    public String getKr1() {
        return kr1;
    }

    public void setKr1(String kr1) {
        this.kr1 = kr1;
    }

    public String getKr2() {
        return kr2;
    }

    public void setKr2(String kr2) {
        this.kr2 = kr2;
    }

    public String getKr3() {
        return kr3;
    }

    public void setKr3(String kr3) {
        this.kr3 = kr3;
    }

    public String getKr4() {
        return kr4;
    }

    public void setKr4(String kr4) {
        this.kr4 = kr4;
    }

    public String getKr5() {
        return kr5;
    }

    public void setKr5(String kr5) {
        this.kr5 = kr5;
    }

    public String getKr6() {
        return kr6;
    }

    public void setKr6(String kr6) {
        this.kr6 = kr6;
    }

    public String getKr7() {
        return kr7;
    }

    public void setKr7(String kr7) {
        this.kr7 = kr7;
    }

    public String getKr8() {
        return kr8;
    }

    public void setKr8(String kr8) {
        this.kr8 = kr8;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }
}
