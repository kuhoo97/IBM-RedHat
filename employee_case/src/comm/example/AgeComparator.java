package comm.example;

import java.util.Comparator;
import java.util.*;

public class AgeComparator extends Employee implements Comparator {

	
	@Override
	public int compare(Object o1, Object o2) {
		Employee emp= null;
		Employee emp1= null;
		if(o1 instanceof Employee && o2 instanceof Employee)
		{
			emp = (Employee)o1;
			 emp1 = (Employee)o2;
		}
		if(emp.getAge()>emp1.getAge())
		{
			return -1;
		}
		else
			return 1;
		
	}
	
	
	
	

}
