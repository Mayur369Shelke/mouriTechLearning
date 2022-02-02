package com.mouritech.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springDI.config.AppConfiguration;
import com.mouritech.springDI.service.FieldDI.FieldBasedInjection;

public class TestFieldBasedInjection {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);

		FieldBasedInjection Fbi = container.getBean(FieldBasedInjection.class);
	
	Fbi.sendMsg("Field based");

	}

}
