package com.masum.kafkaConsumer.services;

import com.masum.kafkaConsumer.dtos.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "test_group")
    public void consume1(String message) {
        System.out.println("Consumed message 1: " + message);
    }

    @KafkaListener(topics = "test_topic_3", groupId = "test_group_3")
    public void consumeRiderLocation(RiderLocation riderLocation) {
        System.out.println("Consumed Rider Location: " + riderLocation);
    }
}
