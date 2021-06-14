package comm.example;

import java.util.Date;
import java.util.*;

import java.text.DateFormat;


public class Employee implements Comparable {
 
	
	private int id;
	private String name;
	private String department;
	private int age;
	private int salary;
	Date dateOfJoining = new Date();
	public Employee() {
		super();
	}
	public Employee(int id, String name, String department, int age, int salary, Date dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getDepartment() {
		return department;
	}
	protected void setDepartment(String department) {
		this.department = department;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected int getSalary() {
		return salary;
	}
	protected void setSalary(int salary) {
		this.salary = salary;
	}
	protected Date getDateOfJoining() {
		return dateOfJoining;
	}
	protected void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee emp=null;
		if(o instanceof Employee)
		{
			emp=(Employee)o;
		}
		if(this.salary>emp.salary)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	 //return 0;
	}
	@Override
	public String toString() {
		String s = String.format("%-15s %-30s %-30s %-10s %-10s %10s %10s\n",id,name,department,age,salary,dateOfJoining);
		return s;
	}
	
	
	
	
	
}
