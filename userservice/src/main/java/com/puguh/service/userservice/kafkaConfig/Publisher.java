package com.puguh.service.userservice.kafkaConfig;

import com.puguh.service.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Publisher {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(String topic, User payload) {
        kafkaTemplate.send(topic, payload);
    }

}
