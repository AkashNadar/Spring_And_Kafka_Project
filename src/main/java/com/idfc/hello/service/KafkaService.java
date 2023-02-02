package com.idfc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> template;
	private String topic = "firsttopic";
	
	public String send(String message) {
		this.template.send(this.topic, message);
		return "Message Sent!";
	}
}
