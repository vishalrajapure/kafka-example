package com.example.kafka.kafkaexample;

import com.example.kafka.kafkaexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "Kafka_example", groupId = "group_user", containerFactory = "userKafkaListenerFactor")
    public void consumeJson(User user) {
        System.out.println("Consumed message : " + user);
    }
}
