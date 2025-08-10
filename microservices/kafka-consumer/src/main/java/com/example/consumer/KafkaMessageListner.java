package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner 
{
	
	Logger log = LoggerFactory.getLogger(KafkaMessageListner.class);
	
	
	@KafkaListener(topics="demo-topic-1",groupId="demo-group-1")
	public void consumer1(String message) {
		log.info("consumer1 consumed the message {}", message);
	}

}
