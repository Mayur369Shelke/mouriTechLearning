package com.example.unittest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MessageControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	@DisplayName("/testingMessage controller")
	void testprintMessagecontroller() {
		String testMessage = "hello";
		URI yargetUri = UriComponentsBuilder.fromUriString("/printmessage").queryParam("message", "hello").build().encode().toUri();
	
	String testOutput = this.restTemplate.getForObject(yargetUri, String.class);
	assertEquals(testOutput, testMessage);
	
	}

}
