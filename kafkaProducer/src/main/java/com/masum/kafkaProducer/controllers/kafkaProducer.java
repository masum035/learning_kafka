package com.masum.kafkaProducer.controllers;

import com.masum.kafkaProducer.dtos.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class kafkaProducer {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping("/publish")
    public String publishMessage() {
        RiderLocation riderLocation = RiderLocation.builder()
                .riderId(UUID.randomUUID().toString())
                .latitude(23.8103)
                .longitude(90.4125)
                .build();
        kafkaTemplate.send("test_topic_3", riderLocation);
        return "Message published successfully for riderId: " + riderLocation.getRiderId();
    }
}
