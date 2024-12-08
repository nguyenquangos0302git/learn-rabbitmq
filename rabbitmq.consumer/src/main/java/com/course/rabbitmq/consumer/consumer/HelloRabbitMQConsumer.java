package com.course.rabbitmq.consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitMQConsumer {

    @RabbitListener(queues = "course.hello")
    public void listener(String message) {
        System.out.println("Consuming: " + message);
    }

}
