package com.example.kafka.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.producerConsumer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	private KafkaProducer kafkaproducer;
	
	public MessageController(KafkaProducer kafkaproducer)
	{
		this.kafkaproducer=kafkaproducer;
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		kafkaproducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to the topic");
	}

}
