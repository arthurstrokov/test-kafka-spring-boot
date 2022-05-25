package com.gmail.arthurstrokov.kafka;

import com.gmail.arthurstrokov.kafka.model.Address;
import com.gmail.arthurstrokov.kafka.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("msg")
public class MsgController {

    private final KafkaTemplate<Long, UserDto> kafkaTemplate;

    @PostMapping
    public void sendMsg(Long msgId, UserDto msg) {
        msg.setAddress(new Address("RU", "Msk", "Main", 1L, 1L));
        ListenableFuture<SendResult<Long, UserDto>> future = kafkaTemplate.send("msg", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }
}
