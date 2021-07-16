package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AssigneeRepository;
import com.example.demo.model.Assignee;

@Service
public class AssigneeServiceImpl implements AssigneeService {

	private AssigneeRepository assigneeRepository;
	
	
	@Autowired
	public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
		super();
		this.assigneeRepository = assigneeRepository;
	}

	@Override
	public Assignee createAssignee(Assignee assignee) {
		// TODO Auto-generated method stub
		return assigneeRepository.save(assignee);
	}

	@Override
	public List<Assignee> getAllAssignee() {
         List<Assignee> a = assigneeRepository.findAll();
        		 return a;
	}

	@Override
	public Assignee findByAssigneeName(String assignName) {
		Assignee assignee = assigneeRepository.findByAssigneeName(assignName);
		return assignee;
	}

}
