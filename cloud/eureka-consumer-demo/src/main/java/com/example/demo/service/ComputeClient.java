package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by apple on 2017/7/7.
// */
@FeignClient(name="provide",fallback = ComputeHystrix.class)
//@FeignClient(name="provide")
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
    @RequestMapping(method = RequestMethod.GET, value = "/rest")
    String rest(@RequestParam(value = "s") String s);

}
