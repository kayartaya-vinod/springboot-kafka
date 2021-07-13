package com.kvinod.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/messages")
public class KafkaController {

    @Autowired
    KafkaMessageProducer producer;

    @PostMapping
    public void sendMessage(@RequestBody String msg) {
        log.info("message is {}", msg);
        producer.publishTopic(msg);
    }

}
