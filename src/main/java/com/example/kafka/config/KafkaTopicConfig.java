package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration			
public class KafkaTopicConfig {
	
	
	public NewTopic practiceTopic()
	{
		return TopicBuilder.name("practiceTopic")
				.build();				
	}
	

}
