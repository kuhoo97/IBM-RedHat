package org.example.demo.model;

public enum Status {

	ACTIVE("Active"),INACTIVE("Inactive");
	
	private String status;
	private Status(String status) {
		this.status= status;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	
	
}
