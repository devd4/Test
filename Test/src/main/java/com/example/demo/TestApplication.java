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
		
		return "<h1>Hello, Application deployed.</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
