package com.practice.PracticeSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practice")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class HystrixPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixPracticeApplication.class, args);
	}

}
