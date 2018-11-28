package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.StationMapper;
import com.adorgroup.babycar.mqtt.domain.Station;
import com.adorgroup.babycar.mqtt.domain.enums.StationStatus;
import com.adorgroup.babycar.mqtt.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationMapper stationMapper;
    @Override
    public void changeStationStat(String stationId, int status) {
        Station station  = stationMapper.selectByPrimaryKey(stationId);
        if(station!=null&&station.getStatus()!= StationStatus.LOCKED.getValue()) {
            if (station.getStatus() == StationStatus.NOACTIVATE.getValue()) {
                //如果是未激活状态，新增激活时间
                station.setWorktime(new Date());
            }
            if (station.getStatus() != status) {
                station.setStatus(status);
                stationMapper.updateByPrimaryKeySelective(station);
            }
        }
    }
}
