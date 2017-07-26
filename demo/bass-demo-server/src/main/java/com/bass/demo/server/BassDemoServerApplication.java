package com.bass.demo.server;


import com.bass.support.BassSupportApplication;
import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;

@EnableDubboConfiguration("com.bass.demo.server.dubbo")
public class BassDemoServerApplication extends BassSupportApplication{

}
