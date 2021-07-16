package com.example.demo.service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IssueNotFoundException;
import com.example.demo.model.Issue;
import com.example.demo.model.Severity;
import com.example.demo.repo.IssueRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IssueServiceImpl  implements IssueService  {

	private IssueRepository issueRepository;
	
	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}

	@Override
	public Issue createNewIssue(Issue issue) {
		// TODO Auto-generated method stub
		log.info("within create issue service");
		return issueRepository.save(issue);
	}

	@Override
	public List<Issue> displayAllIssues() {
		// TODO Auto-generated method stub
		log.info("within display issue service");
		return issueRepository.findAll();
	}
/*
	@Override
	public Optional<Issue> findIssueById(String id) {
		Optional<Issue> issue=issueRepository.findById(id);
		
		//if it's not optional issue then for object of Issue, we can 
				//write if(issue==null)
		if(issue.isEmpty())
		{
			throw new IssueNotFoundException("isue with the given id not found.");
		}
		
		return issue;
	}

	@Override
	public Issue updateIssue(String id, Issue issue) {
		Optional<Issue> issue1=issueRepository.findById(id);
		if(issue1.isEmpty())
		{
			throw new IssueNotFoundException("issue with the given id not found.");
		}
		Issue tempIssue=issue1.get();
		tempIssue.setSeverity(issue.getSeverity());
		tempIssue.setAssignee(issue.getAssignee());
		tempIssue.setDescription(issue.getDescription());
		issueRepository.save(tempIssue);
		log.info("updated");
		return tempIssue;
	}

	@Override
	public Issue removeIssue(String id) {
		// TODO Auto-generated method stub
		Optional<Issue> issue1=issueRepository.findById(id);
		
		if(issue1.isEmpty())
		{
			throw new IssueNotFoundException("isue with the given id not found.");
		}
		Issue tempIssue=issue1.get();
		issueRepository.delete(tempIssue);
		log.info("deleted");
		return tempIssue;
	}
*/
	@Override
	public List<Issue> findByAssignee(String assignee) {
		
		List<Issue> list = issueRepository.findByAssignee(assignee);
		if(list.isEmpty())
		{
			throw new IssueNotFoundException("issue with "+assignee+" not found");
			
		}
		List<Issue> list1= new ArrayList<Issue>();
		Iterator<Issue> i = list.iterator();
		while(i.hasNext())
		{
			list1.add(i.next());
		}
		log.info("Found by assignee");
		return list1;
	}
/*
	@Override
	public List<Issue> findByDescription(String description) {
		List<Issue> list = issueRepository.findByDescription(description);
		
		if(list.isEmpty())
		{
			throw new IssueNotFoundException("issue with "+description+" not found");
			
		}
		List<Issue> list1= new ArrayList<Issue>();
		Iterator<Issue> i = list.iterator();
		while(i.hasNext())
		{
			list1.add(i.next());
		}
		log.info("found by description");
		return list1;
	}

	@Override
	public List<Issue> findBySeverity(Severity severity) {
		List<Issue> list = issueRepository.findBySeverity(severity);
		
		if(list.isEmpty())
		{
			throw new IssueNotFoundException("issue with "+severity+" not found");
			
		}
		List<Issue> list2= new ArrayList<Issue>();
		Iterator<Issue> i = list.iterator();
		while(i.hasNext())
		{
			list2.add(i.next());
		}
		log.info("found by severity");
		return list2;
	}

/*	//without optional<issue>
	@Override
	public Issue findById(String id) {
		// TODO Auto-generated method stub
		log.info("within display issue find by id");
		Issue issue = issueRepository.findById(id).get();
		if(issue==null)
		{
			throw new IssueNotFoundException("issue with "+id+" not found");
		}
		return issue;
	}
*/	
	

}
