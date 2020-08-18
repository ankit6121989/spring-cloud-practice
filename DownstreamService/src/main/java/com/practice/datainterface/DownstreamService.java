package com.practice.datainterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practice")
@EnableDiscoveryClient
public class DownstreamService{

	public static void main(String[] args) {
		SpringApplication.run(DownstreamService.class, args);
	}
}
