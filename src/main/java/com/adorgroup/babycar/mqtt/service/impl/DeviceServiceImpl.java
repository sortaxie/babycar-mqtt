package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.DeviceMapper;
import com.adorgroup.babycar.mqtt.domain.Device;
import com.adorgroup.babycar.mqtt.domain.enums.DeviceStatus;
import com.adorgroup.babycar.mqtt.service.DeviceService;
import com.adorgroup.framework.common.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Transactional
    @Override
    public boolean updateDevice(MessageDto messageDto) {
        String rfid= messageDto.getKr();
        String stationId = messageDto.getOid();
        Device device = deviceMapper.selectByRfid(rfid);
        if(device!=null) {
            device.setStationId(stationId);
            Device updateDevice = new Device();
            int ks = 0;
            if (messageDto.getKr1() != null) {
                ks = 1;
            } else if (messageDto.getKs2() != null) {
                ks = 2;
            } else if (messageDto.getKs3() != null) {
                ks = 3;
            } else if (messageDto.getKs4() != null) {
                ks = 4;
            } else if (messageDto.getKs5() != null) {
                ks = 5;
            } else if (messageDto.getKs6() != null) {
                ks = 6;
            } else if (messageDto.getKs7() != null) {
                ks = 7;
            } else if (messageDto.getKs8() != null) {
                ks = 8;
            }
            updateDevice.setId(device.getId());
            updateDevice.setStationId(stationId);
            updateDevice.setStationKs(ks);
            updateDevice.setStatus(DeviceStatus.AVAILABLE.getValue());
            deviceMapper.updateByPrimaryKeySelective(updateDevice);
            return true;
        }

        return false;
    }
}
