package com.mouritech.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springDI.config.AppConfiguration;
import com.mouritech.springDI.service.setterDi.SetterBaseInjection;

public class TestSetterInjection {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		SetterBaseInjection sbie = container.getBean(SetterBaseInjection.class);
		
		sbie.sendMessage("sent message using whats app");
	}

}
