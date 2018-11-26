package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.service.StationService;

public class ChangeStationStatusTask extends Thread {
    private StationService stationService;
    private String deviceId;
    private int status;

    public ChangeStationStatusTask(String stationId,int status, StationService stationService) {
        this.deviceId = deviceId;
        this.stationService = stationService;
        this.status = status;
    }
    public void run(){
        stationService.changeStationStat(deviceId,status);
    }



}
