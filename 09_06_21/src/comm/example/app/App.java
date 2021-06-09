package comm.example.app;

import comm.example.Employee;

public class App {
	
	public static void main(String args[])
	{
		Employee employee1 = new Employee(1,"Pooja","Yadav","Pooja@email.com",100000);
		Employee employee2 = new Employee(2, "Marry", "Public", "marry@email.com", 100000);
		System.out.println(employee1==employee2);
		System.out.println(employee1.equals(employee2));
	
	}

}
