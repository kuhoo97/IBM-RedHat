package comm.example.main;

import comm.example.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		//Customer customer = new Customer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the customer details: ");
		System.out.println("ID: ");
		int id = scanner.nextInt();
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Email ID: ");
		String email = scanner.next();
		
		Customer customer = new Customer(id,name,email);  
		Account myAcc = new SavingsAccount(100, customer, 1000.0,200.0);
		System.out.println("Enter the amount to check if it can be withdrawn: ");
		Double amount = scanner.nextDouble();
		System.out.println("Status to withdraw the amount for customer: "+ customer);
		System.out.println("\n"+myAcc.withdraw(amount));
	
	}
	
}
