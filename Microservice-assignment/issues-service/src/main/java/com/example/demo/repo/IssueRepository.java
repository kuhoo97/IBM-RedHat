package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Issue;
import com.example.demo.model.Severity;

@Repository
public interface IssueRepository extends JpaRepository<Issue, String>{

	
	@Query
	public List<Issue> findByAssignee(String assignee);
	/*
	@Query
	public List<Issue> findByDescription(String description);
	@Query
	public List<Issue> findBySeverity(Severity severity);
	*/
	
	
}
