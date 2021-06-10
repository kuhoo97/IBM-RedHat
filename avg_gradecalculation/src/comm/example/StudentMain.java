package comm.example;

import java.util.Scanner;

public class StudentMain {
	
	
	public static void main(String[] args)
	{
		Student student = getStudentDetails();
		student.calculateAvg();
		student.findGrade();
		System.out.println("Id: "+student.getId());
		System.out.println("Name: "+student.getName());
		System.out.println("Average: "+student.getAverage());
		System.out.println("Grade: "+student.getGrade());
		
	}

	
	public static Student getStudentDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = scanner.nextInt();
		System.out.println("Enter the name:");
		String name = scanner.next();
		System.out.println("Enter the no of subjects:");
		int no = scanner.nextInt();
		if(no<=0)
		{
			while(no<=0)
			{
				System.out.println("Invalid number of subject");
				System.out.println(" Enter the no of subjects:");
				 no = scanner.nextInt();
				
			}
		}
		int studArr[] = new int[no];
		for(int i=0; i<no;i++)
		{
			System.out.println(" Enter mark for subject "+(i+1)+":");
			int j = scanner.nextInt();
			if(j<0||j>100)
			{
				System.out.println("Invalid Mark");
				System.out.println("Enter the mark for subject "+(i+1)+":");
				no = scanner.nextInt();
			}
			studArr[i]=j;
		}
		Student obj = new Student(id,name,studArr);
		obj.setId(id);
		obj.setName(name);
		return obj;

		
		
	}
}
