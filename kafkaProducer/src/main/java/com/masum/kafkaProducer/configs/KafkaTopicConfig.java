package com.masum.kafkaProducer.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topicName() {
        return new NewTopic("test_topic_2", 3, (short) 1);
    }

}
