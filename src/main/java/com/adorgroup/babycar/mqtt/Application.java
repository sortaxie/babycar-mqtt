package com.adorgroup.babycar.mqtt;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author benju.xie
 * @version 0.0.1
 * @datetime 2018/10/29 16:59
 */

//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.adorgroup.babycar.mqtt.dao")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }




}