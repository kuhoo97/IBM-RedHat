package org.example.demo.dao;

public class AccountNotValidException extends Exception{
	private String message;
	
	public AccountNotValidException(String message)
	{
		super();
		this.message=message;
		
	}
	public String getMessage()
	{
		return message;
	}
	
	
	
	
	
	
	
}
