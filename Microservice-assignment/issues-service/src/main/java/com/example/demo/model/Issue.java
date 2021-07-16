package com.example.demo.model;

import org.springframework.data.annotation.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue {
	
	@Id
	private String id;
	private String description;
	private Severity severity;
	private String assignee;

}
