package comm.example;

import java.io.IOException;
import java.util.Set;

public interface StudentResult {


	public void createStudentAndSave(Set<Student> student)throws IOException;
	public void displayStudentFromFile() throws IOException,ClassNotFoundException ;
	
	
}
