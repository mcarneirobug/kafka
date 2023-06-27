package com.dio.expert.kafkaexpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaExpertApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExpertApplication.class, args);
	}

}
