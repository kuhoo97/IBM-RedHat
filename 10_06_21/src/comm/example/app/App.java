package comm.example.app;

import java.util.Scanner;

import comm.example.*;

public class App {

	
	private static Scanner scanner= new Scanner(System.in);
	private Employee[] employees;
	// Enter the size of array
	static int size = scanner.nextInt();
	static int i;
	{
	employees = new Employee[size];
	i = 0;
	}
	public static void main(String args[]) {
	System.out.println("Proceed with entering  respective detail(s)");
	
	App app = new App();
	
	for(i=0;i<size;i++)
		{

		System.out.println("\n Enter id.");
		int id = scanner.nextInt();
		System.out.println("\n Enter First Name.");
		String firstName = scanner.next();
		System.out.println("\n Enter last name.");
		String lastName = scanner.next();
		System.out.println("\n Enter email.id.");
		String emailid = scanner.next();

		
		System.out.println("Choose from the option below to proceed: ");
		
		System.out.println("\n1. Employee.");
		System.out.println("2. Manager.");
		System.out.println("3. Engineer.");
		System.out.println("0. To exit.");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.print("Enter the Employee Details.");
			app.employees[i]=new Employee(id, firstName, lastName, emailid);
				break;
		case 2:
			System.out.print("Enter the Manager department Details.");
			String depart = scanner.next();
			app.employees[i]=new Manager(id, firstName, lastName, emailid,depart);
			break;
		case 3:
			System.out.print("Enter the Engineer Stream Details.");
			String stream = scanner.next();
			app.employees[i]=new Engineer(id, firstName, lastName, emailid,stream);
			break;
		case 0:
			System.out.print("Exiting.....");
			System.exit(0);
		default:
			System.out.println("invalid choice");
			break;
		}
	
		}
	
	
	System.out.println("The required details are: ");
	//enhanched for loop
			for(Employee employee : app.employees)
			{
				System.out.println(employee);
			}
			
		/*	//standard for loop
			for(int i=0;i<app.employees.length;i++)
			{
				System.out.println(app.employees[i]);
			}
		*/	
	
	
}

}