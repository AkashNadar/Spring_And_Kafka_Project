package com.idfc.hello.controller;

import com.idfc.hello.service.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaService service;
	
	@GetMapping("/producer")
	public String producer(@RequestParam String message) {
		return this.service.send(message);
	}
}
