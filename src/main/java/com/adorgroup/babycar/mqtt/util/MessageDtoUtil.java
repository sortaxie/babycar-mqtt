package com.adorgroup.babycar.mqtt.util;

import com.adorgroup.framework.common.MessageDto;

public class MessageDtoUtil {


    public static void  setKrValue(MessageDto messageDto){
        if (messageDto.getKr1() != null) {
            messageDto.setKr(messageDto.getKr1());
            messageDto.setKr1(null);
        } else if (messageDto.getKr2() != null) {
            messageDto.setKr(messageDto.getKr2());
            messageDto.setKr2(null);
        } else if (messageDto.getKr3() != null) {
            messageDto.setKr(messageDto.getKr3());
            messageDto.setKr3(null);
        } else if (messageDto.getKr4() != null) {
            messageDto.setKr(messageDto.getKr4());
            messageDto.setKr4(null);
        } else if (messageDto.getKr5() != null) {
            messageDto.setKr(messageDto.getKr5());
            messageDto.setKr5(null);
        } else if (messageDto.getKr6() != null) {
            messageDto.setKr(messageDto.getKr6());
            messageDto.setKr6(null);
        } else if (messageDto.getKr7() != null) {
            messageDto.setKr(messageDto.getKr7());
            messageDto.setKr7(null);
        } else if (messageDto.getKr8() != null) {
            messageDto.setKr(messageDto.getKr8());
            messageDto.setKr8(null);
        }


    }
}
