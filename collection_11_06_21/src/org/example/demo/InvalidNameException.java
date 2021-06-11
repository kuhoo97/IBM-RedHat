package org.example.demo;

public class InvalidNameException extends RuntimeException{
	 private String message;
     
     public InvalidNameException(String message) {
 		super();
 		this.message = message;
 	}
     
     public String getMessage() {
 		return message;
 	}   
	
	
	
}
