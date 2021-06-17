package org.example.app;

import java.util.List;
import java.sql.SQLException;
import java.util.Iterator;

import org.example.dao.EmployeeDao;
import org.example.dao.EmployeeDaoImpl;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.example.service.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) throws SQLException {
	
		// After adding service layer
		EmployeeService service=new EmployeeServiceImpl();
		List<Employee> employees=service.getAllEmployees();
		
	//	EmployeeDao dao=new EmployeeDaoImpl();
	//	List<Employee> employees=dao.getAllEmployees();
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}
	
	
}
