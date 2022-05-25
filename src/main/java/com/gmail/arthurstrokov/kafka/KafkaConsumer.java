package com.gmail.arthurstrokov.kafka;

import com.gmail.arthurstrokov.kafka.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "msg")
    public void orderListener(ConsumerRecord<Long, UserDto> consumerRecord) {
        log.info(String.valueOf(consumerRecord.partition()));
        log.info(String.valueOf(consumerRecord.key()));
        log.info(String.valueOf(consumerRecord.value()));
    }
}
