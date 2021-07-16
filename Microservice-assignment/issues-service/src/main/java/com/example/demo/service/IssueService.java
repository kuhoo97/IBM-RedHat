package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Issue;
import com.example.demo.model.Severity;

public interface IssueService {

	
	public Issue createNewIssue(Issue issue);
	
	
	public List<Issue> displayAllIssues();
	/*
	
//	public Issue findById(String id);
	public java.util.Optional<Issue> findIssueById(String id);
	*/
	public List<Issue> findByAssignee(String assignee);
	/*
	public List<Issue> findByDescription(String description);
	public List<Issue> findBySeverity(Severity severity);
	
	public Issue updateIssue(String id, Issue issue);
	public Issue removeIssue(String id);
	
	*/
	
}
