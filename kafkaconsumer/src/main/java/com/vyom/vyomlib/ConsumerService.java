package com.vyom.vyomlib;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "healthcare" , groupId = "group1")
	public void listenConsumer(String msg) {
		
		System.out.println(msg);
	}
}
