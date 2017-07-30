package com.bass.demo.server;


import com.bass.support.BassSupportApplication;
import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;

@EnableDubboConfiguration("com.bass.demo.server.dubbo")
public class BassDemoServerApplication extends BassSupportApplication{
    public static void main(String[] args) {
        SpringApplication.run(BassDemoServerApplication.class, args);
    }
}
