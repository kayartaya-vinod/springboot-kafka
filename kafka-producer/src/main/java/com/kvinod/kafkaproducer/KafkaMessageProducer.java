package com.kvinod.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaMessageProducer {

    public static final String topic = "demotopic";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void publishTopic(String message) {
        log.info("publishing to topic {}", topic);
        template.send(topic, message);
    }

}
