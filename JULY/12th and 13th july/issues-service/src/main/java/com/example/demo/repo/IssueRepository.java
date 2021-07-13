package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Issue;
import com.example.demo.model.Severity;

@Repository
public interface IssueRepository extends MongoRepository<Issue, String>{

	@Query
	public List<Issue> findByAssignee(String assignee);
	@Query
	public List<Issue> findByDescription(String description);
	@Query
	public List<Issue> findBySeverity(Severity severity);
	
	
	
}
