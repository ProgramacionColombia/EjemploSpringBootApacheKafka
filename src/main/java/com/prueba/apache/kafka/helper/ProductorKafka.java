package com.prueba.apache.kafka.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author ProgramacionColombia
 */
@Component
public class ProductorKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String kafkaTopic = "topico";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }

}
