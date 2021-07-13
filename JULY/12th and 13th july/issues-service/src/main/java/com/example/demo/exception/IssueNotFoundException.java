package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class IssueNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5883220599379229774L;
    private String message;
	
	
	
}
