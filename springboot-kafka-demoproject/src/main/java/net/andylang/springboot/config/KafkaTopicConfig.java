package net.andylang.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic andylangTopic() {
        return TopicBuilder.name("andylang")
                .build();

    }

    @Bean
    public NewTopic andylangJsonTopic() {
        return TopicBuilder.name("andylang_json")
                .build();
    }
}