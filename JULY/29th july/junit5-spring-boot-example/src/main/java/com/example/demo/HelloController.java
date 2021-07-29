package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/about")
	public String aboutMe() {
		return "JUnit 5 and Spring Boot Example.";
	}
	@GetMapping("/person")
	public Person getPerson()
	{
		return new Person(1,"John");
	}
	
	@GetMapping("/list")
	public List<Person> getAllPerson()
	{
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"Harry"));
		list.add(new Person(2,"Mona"));
		return list;
	}

	
}
