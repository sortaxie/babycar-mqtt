package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.DeviceItemOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeviceItemOrderMapper {

    @Select("SELECT * FROM device_item_order WHERE carid = #{carId} and stat = 1")
    DeviceItemOrder getClearingOrder(String carId);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceItemOrder record);

    int insertSelective(DeviceItemOrder record);

    DeviceItemOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceItemOrder record);

    int updateByPrimaryKey(DeviceItemOrder record);
}