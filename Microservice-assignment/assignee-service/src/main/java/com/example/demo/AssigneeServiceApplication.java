package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.dao.AssigneeRepository;
import com.example.demo.model.Assignee;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
public class AssigneeServiceApplication implements CommandLineRunner{

	private AssigneeRepository assigneeRepository;
	
	@Autowired
	public AssigneeServiceApplication(AssigneeRepository assigneeRepository) {
		
	    this.assigneeRepository = assigneeRepository;
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AssigneeServiceApplication.class, args);
	}


	
	@Override
	public void run(String... args) throws Exception {
		List<Assignee> list = new ArrayList<Assignee>();
		list.add(new Assignee("A", true));
		list.add(new Assignee("B", true));
		list.add(new Assignee("C", false));
		list.add(new Assignee("D",false));
		list.add(new Assignee("E",true));
		
	}
   
}
