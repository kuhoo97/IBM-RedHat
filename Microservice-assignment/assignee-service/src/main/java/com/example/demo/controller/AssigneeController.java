package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Assignee;
import com.example.demo.service.AssigneeService;

@RestController
public class AssigneeController {

	private AssigneeService assigneeService;
	private Environment environment;
	
	@Autowired
	public AssigneeController(AssigneeService assigneeService, Environment environment) {
		super();
		this.assigneeService = assigneeService;
		this.environment = environment;
	}
	
	@GetMapping
	public String getStatus() {
		return "app running and up on port" + environment.getProperty("local.server.port");
	}
	@PostMapping("/assignee")
	public Assignee createAssignee(@RequestBody Assignee assignee)
	{
		return assigneeService.createAssignee(assignee);
	}
	
	@GetMapping("/assignee")
	public List<Assignee> getAllAssignee()
	{
		return assigneeService.getAllAssignee();
	}
    
	@GetMapping("/assignee/{assignName")
	public Assignee getAssigneeByName(@PathVariable("assignName") String assignName)
	{
		return assigneeService.findByAssigneeName(assignName);
	}
	
}
