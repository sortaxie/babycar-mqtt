package com.adorgroup.babycar.mqtt.task;

import com.adorgroup.babycar.mqtt.MessageDto;

public class BaseTask extends Thread {

    public MessageDto messageDto;

    public BaseTask(MessageDto messageDto){
        this.messageDto = messageDto;
    }


    public MessageDto getMessageDto() {
        return messageDto;
    }

    public void setMessageDto(MessageDto messageDto) {
        this.messageDto = messageDto;
    }
}
