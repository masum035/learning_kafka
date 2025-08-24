package com.masum.kafkaProducer.configs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@EnableAutoConfiguration
public class FunctionsClass {

    @Bean(name = "uppercaseDemo")
    public Function<String, String> uppercaseDemo() {
        return String::toUpperCase;
    }

}
