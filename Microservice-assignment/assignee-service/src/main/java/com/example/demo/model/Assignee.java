package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
public class Assignee {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer assignId;
	@Column(name = "assign_name",unique = true)
	private String assignName;
	@JsonProperty
	private Boolean isAvailable;
	public Assignee(String assignName, Boolean isAvailable) {
		super();
		this.assignName = assignName;
		this.isAvailable = isAvailable;
	}
	

	
	

}
