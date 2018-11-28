package com.adorgroup.babycar.mqtt.util;

import com.adorgroup.framework.common.MessageDto;

public class MessageDtoUtil {


    public static void  setKrValue(MessageDto messageDto){
        if (messageDto.getKr1() != null) {
            messageDto.setKr(messageDto.getKr1());
        } else if (messageDto.getKr2() != null) {
            messageDto.setKr(messageDto.getKr2());
        } else if (messageDto.getKr3() != null) {
            messageDto.setKr(messageDto.getKr3());
        } else if (messageDto.getKr4() != null) {
            messageDto.setKr(messageDto.getKr4());
        } else if (messageDto.getKr5() != null) {
            messageDto.setKr(messageDto.getKr5());
        } else if (messageDto.getKr6() != null) {
            messageDto.setKr(messageDto.getKr6());
        } else if (messageDto.getKr7() != null) {
            messageDto.setKr(messageDto.getKr7());
        } else if (messageDto.getKr8() != null) {
            messageDto.setKr(messageDto.getKr8());
        }


    }
}
