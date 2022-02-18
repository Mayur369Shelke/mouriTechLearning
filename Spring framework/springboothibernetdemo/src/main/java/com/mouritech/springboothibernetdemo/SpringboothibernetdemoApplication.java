package com.mouritech.springboothibernetdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringboothibernetdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothibernetdemoApplication.class, args);
	}

}
