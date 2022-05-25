package com.gmail.arthurstrokov.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TestKafkaSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestKafkaSpringBootApplication.class, args);
    }
}
