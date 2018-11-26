package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    @Select("select * from dvc_order o where o.rfid =#{rfid} and end_time is null")
    Order selectByRfid(@Param("rfid") String rfid);
}