package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.DeviceMapper;
import com.adorgroup.babycar.mqtt.dao.OrderMapper;
import com.adorgroup.babycar.mqtt.domain.Device;
import com.adorgroup.babycar.mqtt.domain.Order;
import com.adorgroup.babycar.mqtt.domain.enums.OrderStatus;
import com.adorgroup.babycar.mqtt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public boolean clearingOrder(String rfid,String stationId) {
        Order order = orderMapper.selectByRfid(rfid,OrderStatus.START.getValue());
        if(order!=null){
            Date endTime = new Date();
            double deviceMoney = 0;//设备收费
            Long deviceTim = ((endTime.getTime() - order.getStartTime().getTime()) / 1000)/3600 +1;
            deviceMoney = order.getDeviceUnitPrice() * deviceTim;
            double stationMoney =0;//站点收费
            Long stationTim = ((endTime.getTime() - order.getStartTime().getTime()) / 1000)/3600 +1;
            stationMoney =  order.getStationUnitPrice() * stationTim;
            order.setMoneys(deviceMoney+stationMoney); //总金额
            Order updateOrder = new Order();
            updateOrder.setId(order.getId());
            updateOrder.setEndTime(endTime);
            updateOrder.setDeviceMoney(deviceMoney);
            updateOrder.setStationMoney(stationMoney);
            updateOrder.setMoneys(deviceMoney+stationMoney);
            updateOrder.setStatus(OrderStatus.END.getValue());
            orderMapper.updateByPrimaryKeySelective(updateOrder);
            Device device = deviceMapper.selectByRfid(rfid);
            device.setStationId(stationId);
            Device updateDevice = new Device();
            updateDevice.setId(device.getId());
            updateDevice.setStationId(stationId);
            deviceMapper.updateByPrimaryKeySelective(updateDevice);
            return true;
        }
        return false;
    }

    @Override
    public boolean unlock(String rfid) {
        Order order = orderMapper.selectByRfid(rfid,OrderStatus.PRE.getValue());
        if(order!=null){
            Order updateOrder = new Order();
            updateOrder.setId(order.getId());
            updateOrder.setStatus(OrderStatus.START.getValue());
            orderMapper.updateByPrimaryKeySelective(updateOrder);
            return true;
        }
        return false;
    }
}
