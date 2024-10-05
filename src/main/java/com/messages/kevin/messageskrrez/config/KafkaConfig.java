package com.messages.kevin.messageskrrez.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Kevin
 */
@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic contactTopic() {
        return TopicBuilder.name("contact-messages")
                .partitions(1)
                .replicas(1)
                .build();
    }
}