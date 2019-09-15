package com.zp.consumerticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient //开启发现服务的功能
@SpringBootApplication
public class ConsumerTicketApplication {



	public static void main(String[] args) {
		SpringApplication.run(ConsumerTicketApplication.class, args);
	}
	@LoadBalanced //启动负载均衡机制
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
