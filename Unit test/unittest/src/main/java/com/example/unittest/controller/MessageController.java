package com.example.unittest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.unittest.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	MessageService mes;
	
	
	@GetMapping("/printmessage")
	public String printMessage(@RequestParam("message")String message) {
		return mes.printMessage(message);
	}

}
