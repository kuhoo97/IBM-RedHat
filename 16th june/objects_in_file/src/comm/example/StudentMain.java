package comm.example;

import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.UUID;
import java.util.Scanner;


public class StudentMain {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException,ClassNotFoundException  {
		
		int choice = 0;
		
		Set<Student> set = new HashSet<Student>();
		
		do {
			System.out.println("Choose from the options below:");
			System.out.println("1. Create:");
		//	System.out.println("2. Update:");
		    System.out.println("3. Save:");
			System.out.println("4. Display:");
			System.out.println("0. Exit:");
			choice=scanner.nextInt();
		
			switch(choice) {
			case 1:
				System.out.print("Enter the name: ");
				String name=scanner.next();
				System.out.print("Enter the grade: ");
				String grade=scanner.next();
	            set.add(new Student(UUID.randomUUID().toString(),name,grade));
	            System.out.println("Created Sucessfully...");
		       
	            break;
	            
			case 3:
				for(Student s : set) {
	            
	            StudentResult result=new StudentResultImpl();
	            result.createStudentAndSave(s);
	      //      System.out.println(result.displayStudentFromFile());
		       }
				 System.out.println("Done");
			     break;
			     
			case 4:
		            
		            StudentResult result1 =new StudentResultImpl();
		            result1.displayStudentFromFile();
			
				
			     
			case 0:
                System.out.println("Exit from System. Bye..");
				
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice Try Again.");
				break;			
			}	
		}while(choice!=0);
		
	}
}
		
