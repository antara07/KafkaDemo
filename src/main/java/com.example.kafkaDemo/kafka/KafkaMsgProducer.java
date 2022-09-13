package com.example.kafkaDemo.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaMsgProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

//    @Value("${spring.kafka.topics.name}")
//    private final String kafkaTopic;

    public void sendMessage(String message) {
        kafkaTemplate.send("kafka-demo-topic", message);

    }
}
