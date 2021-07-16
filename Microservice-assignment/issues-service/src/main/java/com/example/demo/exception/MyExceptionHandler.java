package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.IssueErrorResponseModel;

@ControllerAdvice
public class MyExceptionHandler {

	public ResponseEntity<IssueErrorResponseModel> handleIssueNotFoundException(IssueNotFoundException e)
	{
		IssueErrorResponseModel error = new IssueErrorResponseModel();
	
		error.setMessage(e.getMessage());
		error.setErrprReportingTime(System.currentTimeMillis());
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@ExceptionHandler
	public ResponseEntity<IssueErrorResponseModel> handleGenericException(Exception e)
	{
		IssueErrorResponseModel response=new IssueErrorResponseModel();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<IssueErrorResponseModel>(response,HttpStatus.NOT_FOUND);
	}
	
	
	
	
}
