package com.example.kafka.producerConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics="practiceTopic",groupId="mygroup")
	public void Consume(String message)
	{
		System.out.println("consumed message  "+message);
		
	}
	

}
