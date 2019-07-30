package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.Device;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    @Select("select * from dvc_device where rfid = #{rfid}")
    Device selectByRfid(@Param("rfid") String rfid);

    @Update("update dvc_device set station_id ={stationId},station_ks={ks},status={status} where rfid={rfid}")
    void updateByRfid(@Param("rfid") String rfid,@Param("stationId") String stationId,@Param("ks") int ks,@Param("status") int status);
}