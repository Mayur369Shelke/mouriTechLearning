package com.mouritech.spring.simpleFirstProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Quotation quotation = (Quotation) context.getBean("quotationService");
		String a = quotation.getQuate();
		System.out.println(a);
		
		Greetings greetings = (Greetings) context.getBean("gretingService");
		String b = greetings.getGreet();
		System.out.println(b);
		
	}

}
