package com.example.kafkaDemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

    @Value("${spring.kafka.topics.name}")
    private String kafkaTopic;

    @Bean
    public NewTopic getNewTopic() {
        return TopicBuilder.name(kafkaTopic).build();
    }

}
