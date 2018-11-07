package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.Device;
import com.adorgroup.babycar.mqtt.domain.DeviceKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeviceMapper {
    int deleteByPrimaryKey(DeviceKey key);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(DeviceKey key);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}