package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class Junit5SpringBootExampleApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAbout() {
		String message = this.restTemplate.getForObject("/about", String.class);
		assertEquals("JUnit 5 and Spring Boot Example.", message);
	}
	@Test
	public void testPerson()
	{
		Person person=new Person(1, "John");
		Person tempPerson=this.restTemplate.getForObject("/person", Person.class);
		assertEquals(person.getName(), tempPerson.getName());
		
	}

	@Test
	public void testList()
	{
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"Harry"));
		list.add(new Person(2,"Mona"));
		List<Person> templist =this.restTemplate.getForObject("/list", ArrayList.class);
		int length = templist.size();
		assertEquals(2, length);
	//	assertNotNull(templist);
		
	}

}
