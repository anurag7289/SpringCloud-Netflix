package com.producer.wsh.producer_wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class ProducerApplication {
	public static void main(String[] args) {
		System.out.println("!! Starting ProducerApplication hix !!");
		SpringApplication.run(ProducerApplication.class, args);
	}
}
