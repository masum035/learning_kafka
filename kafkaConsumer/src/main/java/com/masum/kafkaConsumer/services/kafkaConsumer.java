package com.masum.kafkaConsumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "test_group")
    public void consume1(String message) {
        System.out.println("Consumed message 1: " + message);
    }

    @KafkaListener(topics = "test_topic_2", groupId = "test_group_2")
    public void consume2(String message) {
        System.out.println("Consumed message 2: " + message);
    }
}
