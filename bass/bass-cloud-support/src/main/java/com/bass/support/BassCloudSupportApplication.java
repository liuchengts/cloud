package com.bass.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
@EnableFeignClients//启动Feign
@EnableHystrix//开启断路器功能
@EnableAutoConfiguration //启用自动配置
@EnableAsync //启用异步
public class BassCloudSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(BassCloudSupportApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
