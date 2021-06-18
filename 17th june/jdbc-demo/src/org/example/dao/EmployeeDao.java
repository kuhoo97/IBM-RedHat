package org.example.dao;



import java.util.List;
import java.sql.SQLException;

import org.example.model.Employee;

public interface EmployeeDao {
	

public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;
	
	public List<Employee> findById(Integer id)throws SQLException;
}
