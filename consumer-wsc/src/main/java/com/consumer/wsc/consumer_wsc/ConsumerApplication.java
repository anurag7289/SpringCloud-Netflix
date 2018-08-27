package com.consumer.wsc.consumer_wsc;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class ConsumerApplication {
	public static void main(String[] args) throws RestClientException, IOException {
		System.out.println("!!! Starting  ConsumerApplication!!!");
		ApplicationContext ctx = SpringApplication.run(ConsumerApplication.class, args);

		MyConsumer myConsumerClient = ctx.getBean(MyConsumer.class);
		System.out.println("!!! Calling Service !!!");
		System.out.println(myConsumerClient);
		myConsumerClient.getStudent2();
	}

	@Bean
	public MyConsumer myConsumerClient() {
		return new MyConsumer();
	}
	
}
