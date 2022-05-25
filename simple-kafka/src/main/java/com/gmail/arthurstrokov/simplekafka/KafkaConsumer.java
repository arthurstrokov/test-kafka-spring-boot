package com.gmail.arthurstrokov.simplekafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "TOPIC-DEMO")
    public void consume(String message) {
        logger.info("Consuming Message {}", message);
    }
}
