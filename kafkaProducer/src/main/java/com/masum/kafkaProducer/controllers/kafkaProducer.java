package com.masum.kafkaProducer.controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class kafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        kafkaTemplate.send("test_topic_2", message);
        return "Message published successfully: " + message;
    }
}
