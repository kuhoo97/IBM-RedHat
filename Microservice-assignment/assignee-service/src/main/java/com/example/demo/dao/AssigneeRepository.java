package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Assignee;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Integer> {

	@Query
	public Assignee findByAssigneeName(String assignName);
	
}
