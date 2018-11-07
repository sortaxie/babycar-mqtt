package com.adorgroup.babycar.mqtt.dao;

import com.adorgroup.babycar.mqtt.domain.MallAgentSet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MallAgentSetMapper {



    int deleteByPrimaryKey(Integer id);

    int insert(MallAgentSet record);

    int insertSelective(MallAgentSet record);

    MallAgentSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallAgentSet record);

    int updateByPrimaryKey(MallAgentSet record);
}