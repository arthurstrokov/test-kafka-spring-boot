package com.gmail.arthurstrokov.simplekafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final KafkaProducer producer;

    public CommandLineAppStartupRunner(KafkaProducer producer) {
        this.producer = producer;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            producer.sendMessage("Hello from simple kafka. Message: " + i);
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
