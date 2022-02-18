package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return"User service is down at this time !!";
	}
//contactServiceFallback
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return"Contact service is down at this time !!";
	}
}
