package com.kvinod.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demotopic", groupId = "demogroup")
    public void consumeMessage(String message) {
        log.info("message: {}", message);
    }
}
