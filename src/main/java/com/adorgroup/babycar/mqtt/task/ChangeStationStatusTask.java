package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.service.StationService;

public class ChangeStationStatusTask extends Thread {
    private StationService stationService;
    private String stationId;
    private int status;

    public ChangeStationStatusTask(String stationId,int status, StationService stationService) {
        this.stationId = stationId;
        this.stationService = stationService;
        this.status = status;
    }
    public void run(){
        stationService.changeStationStat(stationId,status);
    }



}
