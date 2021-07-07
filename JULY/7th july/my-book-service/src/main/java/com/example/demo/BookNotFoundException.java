package com.example.demo;

public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1668299317653031499L;
	private String message;
	public BookNotFoundException(String message) {
		
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	
	
	
}
