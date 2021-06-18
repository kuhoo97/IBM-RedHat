package org.example.service;

// Adding service layer.
// so model is shared between service and dao layer


import java.sql.SQLException;
import java.util.List;

import org.example.model.Employee;

public interface EmployeeService {
public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;
	public List<Employee> findById(Integer id)throws SQLException;
}