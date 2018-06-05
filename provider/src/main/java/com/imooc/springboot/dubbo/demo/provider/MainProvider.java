package com.imooc.springboot.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers.xml"})
public class MainProvider {

    public static void main(String[] args) {

        SpringApplication.run(MainProvider.class,args);

    }

}