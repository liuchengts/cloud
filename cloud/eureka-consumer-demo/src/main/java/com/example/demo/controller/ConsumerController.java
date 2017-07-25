package com.example.demo.controller;

import com.example.demo.service.ComputeClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@RestController
public class ConsumerController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ComputeClient client;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @HystrixCommand(fallbackMethod = "addsError")
    @RequestMapping(value = "/adds", method = RequestMethod.GET)
    public String adds() {
        return client.rest("adds");
    }
    public String addsError() {
        return "方法熔断器执行";
    }
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String rest() {
      this.loadBalancerClient.choose("provide");//随机访问策略
        return restTemplate.getForObject("http://provide/rest?s=rest", String.class);

    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return client.add(10,20);
    }
}
