package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by apple on 2017/7/7.
 */
@Component
public class ComputeHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        System.out.println("接口实现熔断器方法执行了。。。。。。");
       return  1;
    }

    @Override
    public String rest(String s) {
        return "consumer熔断器方法执行了 s="+s;
    }
}
