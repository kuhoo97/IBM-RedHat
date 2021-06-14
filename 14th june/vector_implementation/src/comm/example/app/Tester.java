package comm.example.app;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Scanner;
import java.util.InputMismatchException;

import comm.example.Employee;

public class Tester {

	
	private void checkSalary(double salary)
	{
		if(salary<=5000)
		{
			throw new InvalidSalaryException("Invalid Salary");
		}
	}
	private void checkName(String nameCheck)
	{
		if(nameCheck.length()<5)
		{
			throw new InvalidNameException("Invalid Name");
		}
	}
	
	
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		Set<Employee> employees=new TreeSet<Employee>();
		int choice=0;
		Tester tester=new Tester();
		
	do
	{
		try {
			System.out.println("1. Add A New Employee.");
			System.out.println("2. Display All Employees.");
			System.out.println("0. Quit");
			System.out.print("Enter Your choice: ");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.print("First Name: ");
				String fname=scanner.next();
				tester.checkName(fname);
				System.out.print("Last Name: ");
				String lname=scanner.next();
				tester.checkName(lname);
				System.out.print("email: ");
				String email =scanner.next();
				tester.checkName(email);		
				
				System.out.print("Salary: ");
				double salary=scanner.nextDouble();
				tester.checkSalary(salary);
				employees.add(new Employee(UUID.randomUUID().toString(), fname,lname,email,salary ));
				System.out.println("Employee Added Sucessfully...");
				break;
				
			case 2:
			//	Set<Employee> employees=new TreeSet<Employee>();
				Iterator<Employee> i=employees.iterator();
				while(i.hasNext())
				{
					Employee emp=i.next();
					System.out.println(emp);
				}

				break;
			case 0:
			//	System.out.println(tester.employees);
				System.out.println("Exit from System. Bye..");
				
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice Try Again.");
				break;	
			}
		} catch (InputMismatchException e) {
			System.err.println("input mispatched.");
			break;
		}
	}while(choice!=0);
		
		
		
		
		
		
		
		
}
}