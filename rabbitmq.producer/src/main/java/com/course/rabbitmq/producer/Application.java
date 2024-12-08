package com.course.rabbitmq.producer;

import com.course.rabbitmq.producer.producer.HelloRabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private HelloRabbitMQProducer helloRabbitMQProducer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloRabbitMQProducer.sendHello(ThreadLocalRandom.current().nextInt() + "");
	}
}
