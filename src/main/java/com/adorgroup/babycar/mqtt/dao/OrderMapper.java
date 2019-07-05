package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    @Select("select * from dvc_order o where o.rfid =#{rfid} and o.status = #{status}")
    Order selectByRfid(@Param("rfid") String rfid,@Param("status")int status);

    @Select("select * from dvc_order o where o.rfid =#{rfid} order by id desc limit 0,1")
    Order selectOneByRfidDesc(@Param("rfid") String rfid);

    @Select("select * from dvc_order o where o.status =#{status}")
    List<Order> selectByStatus(@Param("status") int status);

    int updateOrderUnlock(Order record);
}