package com.xq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroEurekaProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroEurekaProviderApplication.class, args);
	}
}
