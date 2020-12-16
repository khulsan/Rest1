package com.slokam.Rest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Rest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate rt = new RestTemplate();
		return rt;
	}

}
