package com.bass.demo.server;


import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration("com.bass.demo.server.dubbo")
@SpringBootApplication
public class BassDemoServerApplication{

}
