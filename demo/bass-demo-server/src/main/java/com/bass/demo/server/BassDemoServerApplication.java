package com.bass.demo.server;


import com.bass.support.BassSupportApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan({"com.bass.demo.common.model"})
@ComponentScan("com.bass.demo")
public class BassDemoServerApplication extends BassSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(BassDemoServerApplication.class, args);
    }
}
