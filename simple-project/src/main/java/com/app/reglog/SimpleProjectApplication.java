package com.app.reglog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProjectApplication.class, args);
		System.out.println("app started");
	}

}
