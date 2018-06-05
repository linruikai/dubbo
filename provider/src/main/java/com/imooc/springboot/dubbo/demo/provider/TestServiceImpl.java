package com.imooc.springboot.dubbo.demo.provider;

import com.imooc.springboot.dubbo.demo.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String str) {
       // int i = 1 / 0;
        return "hello word:"+str;
    }
}