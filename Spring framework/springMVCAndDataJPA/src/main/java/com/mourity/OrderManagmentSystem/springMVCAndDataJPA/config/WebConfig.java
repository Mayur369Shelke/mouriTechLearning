package com.mourity.OrderManagmentSystem.springMVCAndDataJPA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.mourity.OrderManagmentSystem.springMVCAndDataJPA"})
public class WebConfig implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver resolver() {
		
		InternalResourceViewResolver resolve = new InternalResourceViewResolver();
		
		resolve.setViewClass(JstlView.class);
		resolve.setPrefix("/WEB-INF/views/");
		resolve.setSuffix(".jsp");
		return resolve;
	}
	
	//@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		}

}
