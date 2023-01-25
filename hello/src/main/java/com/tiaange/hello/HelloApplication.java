package com.tiaange.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Welcome to my home page: Enter in url: \"http://localhost:8080/hello\" to see Hello World message";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
