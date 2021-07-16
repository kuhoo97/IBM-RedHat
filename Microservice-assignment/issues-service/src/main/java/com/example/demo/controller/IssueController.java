package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Assignee;
import com.example.demo.model.Issue;
import com.example.demo.model.Severity;
import com.example.demo.proxy.AssigneeClient;
import com.example.demo.service.IssueService;

@RestController
public class IssueController {

	private IssueService issueService;
	private Environment environment;
	private AssigneeClient assigneeClient;
	
	@Autowired
	public IssueController(IssueService issueService, Environment environment, AssigneeClient assigneeClient) {
		this.issueService = issueService;
		this.environment = environment;
		this.assigneeClient = assigneeClient;
	}
	@GetMapping
	public ResponseEntity<String> getStatus()
	{
		return new ResponseEntity<String>("issue service is up and running on port: "+environment.getProperty("local.server.port"),HttpStatus.OK);
	}
	
	/*

	@PostMapping("/issues")
	public ResponseEntity<Issue> createIssue(@RequestBody Issue issue)
	{
		return new ResponseEntity<Issue>(issueService.createNewIssue(issue),HttpStatus.CREATED);
	}
	
	*/
	@GetMapping("/issues")
	public ResponseEntity<List<Issue>> displayIssues()
	{
		return new ResponseEntity<List<Issue>>(issueService.displayAllIssues(),HttpStatus.OK);
	}
	
	/*
	@GetMapping("/issues/{id}")
	public ResponseEntity<Issue> findById(@PathVariable("id") String id)
	{
		return new ResponseEntity<Issue>(issueService.findById(id),HttpStatus.OK);
	}
	*/
	
	/////Find by Id, assignee, description,severity ///////////////////////////
	/*
	
	@GetMapping("/issues/{id}")
	public ResponseEntity<Optional<Issue>> getIssueById(@PathVariable("id") String id) {
		return ResponseEntity.status(HttpStatus.OK).body(issueService.findIssueById(id));
	}
	*/
	@GetMapping("/issues/find/{assignee}")
	public ResponseEntity<List<Issue>> findByAssignee(@PathVariable("assignee") String assignee){
		
		return ResponseEntity.ok(issueService.findByAssignee(assignee));
	}
	
	/*
	@GetMapping("/issues/find1/{description}")
	public ResponseEntity<List<Issue>> findByDescription(@PathVariable("description") String description){
		
		return ResponseEntity.ok(issueService.findByDescription(description));
	}
	
	@GetMapping("/issues/find2/{severity}")
	public ResponseEntity<List<Issue>> findBySeverity(@PathVariable("severity") Severity severity){
		
		return ResponseEntity.ok(issueService.findBySeverity(severity));
	}
///////////////////////////////////////////////////////////////////////////
	
	@PutMapping("/issues/update/{id}")
	public ResponseEntity<Issue> updateIssue(@PathVariable("id") String id, @RequestBody Issue issue) {
		return ResponseEntity.ok(issueService.updateIssue(id, issue));
	}

	@DeleteMapping("/issues/delete/{id}")
	public ResponseEntity<Issue> deleteIssue(@PathVariable("id") String id) {
		return ResponseEntity.ok(issueService.removeIssue(id));
	}
	
	///////////////////////////////implementation of Feign client Assignee////////////////
	
	@PostMapping("/issues/check")
	public ResponseEntity<Issue> createIssue(@RequestBody Issue issue)throws Exception
	{
		Assignee assignee = assigneeClient.getAssigneeByName(issue.getAssignee());
		if(assignee.getIsAvailable()==false)
		{
			throw new Exception();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(issueService.createNewIssue(issue));
	}
	*/
	
}
