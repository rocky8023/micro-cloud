package com.xq.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MircoGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircoGatewayZuulApplication.class, args);
	}
}
