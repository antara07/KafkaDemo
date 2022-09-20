package com.example.kafkaDemo.controller;

import com.example.kafkaDemo.kafka.KafkaMsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaMsgProducer kafkaMsgProducer;

    @PostMapping("/publish")
    public ResponseEntity publishMsg(@RequestBody String message) {
        kafkaMsgProducer.sendMessage(message);
        return ResponseEntity.ok("Message published");
    }
}
