package comm.example;

import java.io.IOException;

public interface StudentResult {


	public void createStudentAndSave(Student student)throws IOException;
	public Student displayStudentFromFile() throws IOException,ClassNotFoundException ;
	
	
}
