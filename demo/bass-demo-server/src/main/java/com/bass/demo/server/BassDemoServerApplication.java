package com.bass.demo.server;


import com.bass.support.BassSupportApplication;
import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableDubboConfiguration("com.bass.demo.server.dubbo")
@EntityScan({"com.bass.demo.common.model"})
public class BassDemoServerApplication extends BassSupportApplication{
    public static void main(String[] args) {
        SpringApplication.run(BassDemoServerApplication.class, args);
    }

}
