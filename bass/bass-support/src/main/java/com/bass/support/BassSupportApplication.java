package com.bass.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //启用异步
public class BassSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(BassSupportApplication.class, args);
	}
}
