package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.MqttGateway;
import com.adorgroup.babycar.mqtt.service.OrderService;
import com.adorgroup.babycar.mqtt.util.MessageDtoUtil;
import com.adorgroup.framework.common.MessageDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  解锁任务
 */
public class UnLockTask extends BaseTask{
    private static Logger log = LoggerFactory.getLogger(UnLockTask.class);
    private OrderService orderService;
    public UnLockTask(MessageDto messageDto, OrderService orderService){
        super(messageDto);
        this.orderService = orderService;
    }

    public  void  run() {
        MessageDtoUtil.setKrValue(messageDto);
        //如果开锁失败
        if("1".equals(messageDto.getKs1())){
            return;
        }else if("1".equals(messageDto.getKs2())){
            return;
        }
        else if("1".equals(messageDto.getKs3())){
            return;
        }
        else if("1".equals(messageDto.getKs4())){
            return;
        }
        else if("1".equals(messageDto.getKs5())){
            return;
        }
        else if("1".equals(messageDto.getKs6())){
            return;
        }
        else if("1".equals(messageDto.getKs7())){
            return;
        }
        else if("1".equals(messageDto.getKs8())){
            return;
        }

        if(!orderService.unlock(messageDto.getKr())) {
            log.error("unlock car error rfid:" + messageDto.getKr() + " stationId:" + messageDto.getOid());
        }
    }
}
