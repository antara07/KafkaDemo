package com.example.kafkaDemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private static Logger logger = LoggerFactory.getLogger(KafkaService.class);

    @KafkaListener(topics = "kafka-demo-topic", groupId = "demo")
    public void listenMsg(String message) {
        logger.info("Message -- " + message);
    }
}
