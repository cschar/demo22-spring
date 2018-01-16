package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Demo22Application {
	
	private static final Logger log = LoggerFactory.getLogger(Demo22Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo22Application.class, args);
	}
}


