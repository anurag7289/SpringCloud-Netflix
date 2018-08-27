package com.producer.ws.producer_ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {
	public static void main(String[] args) {
		System.out.println("!! Starting ProducerApplication !!");
		SpringApplication.run(ProducerApplication.class, args);
	}
}
