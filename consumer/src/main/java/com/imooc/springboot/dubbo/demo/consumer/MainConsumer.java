package com.imooc.springboot.dubbo.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:dubbo-consumer.xml" })
public class MainConsumer {

    public static void main(String[] args) {

        SpringApplication.run(MainConsumer.class,args);

    }

}