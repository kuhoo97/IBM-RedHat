package com.example.demo.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Assignee;

@FeignClient(name ="assignee-service")
public interface AssigneeClient {

	
	@GetMapping("/assignee/{assignName")
	public Assignee getAssigneeByName(@PathVariable("assignName") String assignName);
	
	@GetMapping
	public List<Assignee> getAllAssignee();
}
