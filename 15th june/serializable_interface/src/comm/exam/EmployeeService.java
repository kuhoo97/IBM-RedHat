package comm.exam;

import java.io.IOException;

public interface EmployeeService {
	
	public void createEmployeeAndSave(Employee employee)throws IOException;
	public Employee displayEmployeeFromFile() throws IOException,ClassNotFoundException ;

}