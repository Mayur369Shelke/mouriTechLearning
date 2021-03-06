package com.mouritech.springDI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mouritech.springDI.service.FacebookSMSService;

@Configuration
@ComponentScan("com.mouritech.springDI")
public class AppConfiguration {

@Bean
@Scope("prototype")
public FacebookSMSService fservice() {
	
	
	return new FacebookSMSService();
}
	
}
