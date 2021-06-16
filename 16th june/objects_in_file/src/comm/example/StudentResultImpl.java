package comm.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;


public class StudentResultImpl implements StudentResult {

	
	private FileOutputStream fileOutputStream;
	private ObjectOutputStream objectOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;

@Override
	public void createStudentAndSave(Set<Student> student) throws IOException{

		fileOutputStream=new FileOutputStream("student.ser");
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		
	}

@Override
public void displayStudentFromFile() throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	
	fileInputStream=new FileInputStream("student.ser");
	objectInputStream =new ObjectInputStream(fileInputStream);
	Set<Student> set = (Set<Student>)objectInputStream.readObject();
	//return set;
	System.out.println(set);
	
}



	

	
	

}
