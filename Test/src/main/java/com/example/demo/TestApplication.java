package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Hello Devendra, Welcome To the New App";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
