package com.example.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.unittest.service.MessageService;

@SpringBootTest
public class MessageServiceTest {
	
	@Autowired
	private MessageService messageService;
	
	@Test
	@DisplayName("message is retrieved here...")
	void testprintMessage() {
		String message = "How are you";
		String testOut = messageService.printMessage(message);
		assertEquals(message, testOut);
		
	}
	

}
