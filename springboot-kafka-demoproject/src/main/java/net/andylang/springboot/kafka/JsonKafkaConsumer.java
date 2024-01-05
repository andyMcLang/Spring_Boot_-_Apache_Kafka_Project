package net.andylang.springboot.kafka;

import net.andylang.springboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "andylang_json", groupId = "munRyhma")
    public void consume(User user) {
        LOGGER.info(String.format("Saapunut Json viesti -> %s", user.toString()));
    }
}
