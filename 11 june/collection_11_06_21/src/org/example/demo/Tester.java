package org.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import org.example.Beer;


public class Tester {
 
	private Map<Integer,Beer> map = null;
	{
		map = new HashMap<Integer,Beer>();
	}
	
	private static Scanner scanner=new Scanner(System.in);
	private void checkPrice(double price)
	{
		if(price<=100)
		{
			throw new InvalidPriceException("Invalid Price");
		}
	}
	private void checkName(String nameCheck)
	{
		if(nameCheck.length()<5)
		{
			throw new InvalidNameException("Invalid Name");
		}
	}
	
	public static void main(String args[])
	
	{
		int key=1;
		int choice=0;
		Tester tester=new Tester();
		
		do
		{
			try {
				System.out.println("1. Add A New Beer.");
				System.out.println("2. Display All Available Beer.");
				System.out.println("3. Find a beer.");
				System.out.println("4. Delete a Beer.");
				System.out.println("5. Update a Beer.");
				System.out.println("0. Quit");
				System.out.print("Enter Your choice: ");
				choice=scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Beer Name: ");
					String name=scanner.next();
					tester.checkName(name);
					System.out.print("Beer Price: ");
					double price=scanner.nextDouble();
					
					tester.checkPrice(price);
					tester.map.put(key++, new Beer(UUID.randomUUID().toString(), name, price));
					System.out.println("Beer Added Sucessfully...");
					break;
					/*
					 * if(price<=100) { throw new InvalidPriceException("Invalid Price"); }
					 */
				case 2:
					Collection<Beer> collection=tester.map.values();
					Iterator<Beer> i=collection.iterator();
					while(i.hasNext())
					{
						Beer b=i.next();
						System.out.println(b);
					}

					break;
				case 3:
			//	try {
					System.out.print("Insert the Beer ID:");
				     int id = scanner.nextInt();
				     Beer beer=tester.map.get(id);
				     if(beer==null)
				     {
				    	 System.out.println("No beer found with the id: "+id);
				     }
				     else
				     {
				    	 System.out.println("Beer found with the id: \n"); 
				    	 System.out.println(beer);  
				     }
				//    }catch  (InputMismatchException e) {
				//	    System.err.println("input mispatched, Please input proper ID");
				//	    continue;
				//     }
				     break;
				     
				case 4:
					System.out.print("Enter beer id: ");
					id=scanner.nextInt();
					beer=tester.map.get(id);
					if(beer==null)
					{
						System.out.println("no beer found with the id: "+id);
					}
					else
					{
						tester.map.remove(id);
						System.out.println("Removed Sucessfully");
					}
					break;  
				case 5:
					System.out.print("Enter beer id: ");
					id=scanner.nextInt();
					System.out.print("Beer Name: ");
					String name1=scanner.next();
					System.out.print("Beer Price: ");
					double price1=scanner.nextDouble();
					
					tester.map.put(id, new Beer(UUID.randomUUID().toString(), name1, price1));
					System.out.println("Beer Added Sucessfully...");
					break;
				case 0:
					System.out.println(tester.map);
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
	
	

