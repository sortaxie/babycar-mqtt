package com.adorgroup.babycar.mqtt.service.impl;

import org.springframework.stereotype.Component;

@Component
public class ScheduledServiceImpl {

//    @Autowired
//    private OrderMapper orderMapper;
//
//    //表示每隔15秒
//    @Scheduled(fixedRate = 15000)
//    public void invalidOrderJob() {
//        List<Order> list = orderMapper.selectByStatus(OrderStatus.PRE.getValue());
//        long now = System.currentTimeMillis();
//        for (Order order : list) {
//            if (order.getStartTime() != null && (now - order.getStartTime().getTime()) > 15000) {
//                Order updateOrder = new Order();
//                updateOrder.setId(order.getId());
//                updateOrder.setStatus(OrderStatus.INVALID.getValue());
//                updateOrder.setEndTime(new Date());
//                orderMapper.updateByPrimaryKeySelective(order);
//            }
//        }
//
//    }
}
