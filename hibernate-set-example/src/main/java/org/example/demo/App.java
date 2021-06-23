package org.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.example.demo.dao.StudentNotFoundException;
import org.example.demo.model.Status;
import org.example.demo.model.Student;
import org.example.demo.service.StudentService;
import org.example.demo.service.StudentServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	private static Logger logger = Logger.getLogger("org.example.demo.App.class");

	public static void main(String[] args) {
		
		/*try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=factory.getCurrentSession();
			Student student=new Student();
			Status status = (Status.INACTIVE);
			
			student.setFirstName("John");
			student.setLastName("Doe");
			student.setEmail("john@email.com");
		//	student.setStatus(Status.INACTIVE);
		
			Set<String> set=student.getImages();
			set.add("image-1");
			set.add("image-2");
			set.add("image-3");
		//	set.add("image-4");
			student.setImages(set);
			session.getTransaction().begin();
			session.save(student);		
			session.getTransaction().commit();
		//	System.out.println("done");
			logger.info("done");
			
			
			 For deleting
			 * session.getTransaction().begin(); Student student=session.get(Student.class,
			 * 102); session.remove(student); session.getTransaction().commit();
			 * logger.info("done");
			 
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
*/
   
		Student student = new Student();
		PropertyConfigurator.configure("log4j.properties");

		StudentService service = new StudentServiceImpl();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstName, lastName, email = null;
		int choice = 0;
		do {
			try {
				System.out.println("1. Create student.");
				System.out.println("2. Display All students");
				System.out.println("3. Find student By Id: ");
				System.out.println("4.Update student By Id ");
				System.out.println("5.Delete student By Id ");
				System.out.print("Enter Your Choice: ");
				choice = Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:

					System.out.print("Enter First Name: ");
					firstName = bufferedReader.readLine();
					student.setFirstName(firstName);
					System.out.print("Enter Last Name: ");
					lastName = bufferedReader.readLine();
					student.setLastName(lastName);
					System.out.print("Enter email: ");
					email = bufferedReader.readLine();
					student.setEmail(email);
					Set<String> set = student.getImages();
					System.out.println("How many images want to enter");
					int id = Integer.parseInt(bufferedReader.readLine());
					for (int i = 0; i < id; i++) {
						System.out.println("Enter image name" + id);
						String image1 = bufferedReader.readLine();
						set.add(image1);
					}
					student.setImages(set);
					logger.info("done");
					student = service.createStudent(student);
					System.out.println(student);

					break;
				case 2:
					List<Student> list = service.displayAllStudents();
					Iterator<Student> iterator = list.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}

					break;

				case 3:
					System.out.print("Enter id: ");
					id = Integer.parseInt(bufferedReader.readLine());
					student = service.findById(id);
					if (student == null) {
						logger.info("No Such student found.");
					} else {
						System.out.println("Student found: " + student);
					}

					break;
				case 4:
					try {
						System.out.println("Enter id");
						int id1 = Integer.parseInt(bufferedReader.readLine());
						student = service.updateById(id1);

						logger.info("Updated..");
					} catch (StudentNotFoundException e) {

						System.err.println(e.getMessage());
					}
					break;
				case 5:
					try {
						System.out.println("Enter id");
						int id2 = Integer.parseInt(bufferedReader.readLine());
						service.deleteById(id2);
						logger.info("Deleted..");
					} catch (StudentNotFoundException e) {
						System.err.println(e.getMessage());
					}

					break;
				case 6:
					System.out.println("Exit....");
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice:");
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (choice != 0);

	}
	
	
	
	
	
	
	
	}	
	
	
