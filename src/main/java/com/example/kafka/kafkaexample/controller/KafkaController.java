package com.example.kafka.kafkaexample.controller;

import com.example.kafka.kafkaexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "Kafka_example";

    @GetMapping("/publish/{name}")
    public String publishMessage(@PathVariable("name") String name) {
        this.kafkaTemplate.send(TOPIC, new User(name, "Technology", 20000L));
        return "success";
    }

}
