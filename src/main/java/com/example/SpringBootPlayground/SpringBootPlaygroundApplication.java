package com.example.SpringBootPlayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPlaygroundApplication.class, args);

		System.out.println("this is a test");
	}
}
