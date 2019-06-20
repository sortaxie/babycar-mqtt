package com.adorgroup.babycar.mqtt.service.impl;

import com.adorgroup.babycar.mqtt.dao.DeviceMapper;
import com.adorgroup.babycar.mqtt.dao.OrderMapper;
import com.adorgroup.babycar.mqtt.domain.Device;
import com.adorgroup.babycar.mqtt.domain.Order;
import com.adorgroup.babycar.mqtt.domain.enums.DeviceStatus;
import com.adorgroup.babycar.mqtt.domain.enums.OrderPayStatus;
import com.adorgroup.babycar.mqtt.domain.enums.OrderPriceType;
import com.adorgroup.babycar.mqtt.domain.enums.OrderStatus;
import com.adorgroup.babycar.mqtt.service.OrderService;
import com.adorgroup.babycar.mqtt.util.DateUtils;
import com.adorgroup.framework.common.MessageDto;
import com.adorgroup.framework.common.utils.JexlUtil;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Autowired
    private OrderMapper orderMapper;


    @Value("${babycar.mqtt.freeTime}")
    private long freeTime;


    @Transactional
    @Override
    public Integer clearingOrder(MessageDto messageDto) {
        String rfid= messageDto.getKr();
        Order order = orderMapper.selectByRfid(rfid,OrderStatus.START.getValue());
        if(order!=null&&order.getStatus()==OrderStatus.START.getValue()){
            double deviceMoney =0.0;
            long time = System.currentTimeMillis() - order.getStartTime().getTime();
            Order updateOrder = new Order();
            if(time>freeTime) {
                boolean hour = order.getUnitPriceType().intValue() == OrderPriceType.HOUR.getValue();
                if (StringUtils.isNotEmpty(order.getExpression())) {
                    //公式计算
                    JexlContext context = new MapContext();
                    double times = time(time, order.getMinimumTerm().longValue(), hour);
                    logger.info("阶梯计算总时间 " + times + "   是否是小时单位   " + hour);
                    context.set("_time", times);
                    deviceMoney = JexlUtil.evaluate(context, order.getExpression());
                } else {
                    double tim;
                    if (hour) {
                        tim = 3600000.0;
                    } else {
                        tim = 86400000.0;
                    }
                    double deviceTim = Math.ceil(time / tim / order.getDevicePriceInterval());
                    logger.info("统一价 时间" + deviceTim + "   是否是小时单位   " + hour);
                    if (deviceTim < order.getMinimumTerm().longValue()) {
                        deviceTim = order.getMinimumTerm();
                    }
                    deviceMoney = order.getDeviceUnitPrice() * deviceTim;
                }
            }else {
                updateOrder.setPayStatus(OrderPayStatus.PAID.getValue());
            }

            updateOrder.setId(order.getId());
            updateOrder.setEndTime(new Date());
            updateOrder.setDeviceMoney(deviceMoney);
            updateOrder.setMoneys(deviceMoney);
            updateOrder.setStatus(OrderStatus.END.getValue());
            updateOrder.setReturnStationId(messageDto.getOid());
            orderMapper.updateByPrimaryKeySelective(updateOrder);

//            Order updateOrder = new Order();
//            updateOrder.setId(order.getId());
//            updateOrder.setEndTime(endTime);
//            updateOrder.setDeviceMoney(deviceMoney);
//            updateOrder.setStationMoney(stationMoney);
//            updateOrder.setMoneys(deviceMoney+stationMoney);
//            updateOrder.setReturnStationId(messageDto.getOid());
//            updateOrder.setStatus(OrderStatus.END.getValue());
//            orderMapper.updateByPrimaryKeySelective(updateOrder);
            return order.getUserId();
        }
        return null;
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

    /**
     * 计算时间 小时或者天
     * @param time
     * @param minimumTerm
     * @param tr
     * @return
     */
    private  double time(long time, long minimumTerm, boolean tr) {
        double times;
        if(tr) {
            times = Math.ceil(time/3600000.0);
        } else {
            times = Math.ceil(time/86400000.0);
        }
        if (times < minimumTerm) {
            times = minimumTerm;
        }
        return times;
    }
}
