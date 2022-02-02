package com.mouritech.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springDI.config.AppConfiguration;
import com.mouritech.springDI.service.contructorDI.ContructorBaseInjection;

public class TestContructorInjection {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);

		ContructorBaseInjection cbie = container.getBean(ContructorBaseInjection.class);
		cbie.sendMessage("oooo sent ");
	}

}
