package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private Environment environment;

	@Autowired
	public HelloWorldController(Environment environment) {
		this.environment = environment;
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello()
	{
		return ResponseEntity.ok("Hello From hello-world-service: listining on port:>> "+environment.getProperty("local.server.port"));
	}
	
	
}
