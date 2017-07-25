package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
@EnableFeignClients//启动Feign
public class EurekaConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public IRule ribbonRule() {
//		return new RandomRule();//这里配置策略，和配置文件对应
//	}
}
