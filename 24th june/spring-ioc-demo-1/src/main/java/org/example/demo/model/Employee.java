package org.example.demo.model;

//creating employeee class and checking on beans xml file by creating constructor

public class Employee {

	private String id;
	private String name;
	public Employee() {
	
	}
	
	
	public Employee(String id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDetails()
	{
		return "EMployee Id "+ id+"employee name "+name;
	}
	
	
	
}
