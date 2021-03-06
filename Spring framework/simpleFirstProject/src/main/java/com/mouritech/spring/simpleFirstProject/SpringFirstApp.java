package com.mouritech.spring.simpleFirstProject;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringFirstApp {

	public static void main(String[] args) {
		//Using ApplicationContect container
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Quotation quotation = (Quotation) context.getBean("quotationService");
		String a = quotation.getQuate();
		System.out.println(a);
		
		Greetings greetings = (Greetings) context.getBean("gretingService");
		String b = greetings.getGreet();
		System.out.println(b);
		
		Employee employee = (Employee) context.getBean("empService");
		int c = employee.getEmpId();
		String d = employee.getEmpName();
		System.out.println(c);
		System.out.println(d);
		
		//=====================================================================
		//using bean factory container
		
		System.out.println("below is using beanFactory container");
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
	
		Quotation quotation1 = (Quotation) beanFactory.getBean("quotationService");
		String a1 = quotation1.getQuate();
		System.out.println(a1);
		
		Greetings greetings1 = (Greetings) beanFactory.getBean("gretingService");
		String b1 = greetings1.getGreet();
		System.out.println(b1);
		
		Employee employee1 = (Employee) beanFactory.getBean("empService");
		int c1 = employee1.getEmpId();
		String d1 = employee.getEmpName();
		System.out.println(c1);
		System.out.println(d1);
	
	
	}

}
