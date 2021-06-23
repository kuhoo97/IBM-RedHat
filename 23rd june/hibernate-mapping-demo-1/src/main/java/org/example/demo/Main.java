// student and university one - many and many to one bi

package org.example.demo;






import org.example.demo.model.Student;
import org.example.demo.model.University;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.logging.Logger;



public class Main {

	
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("org.example.demo.Main.class");
	
		 try {
			  
			  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(University.class) .buildSessionFactory(); 
			  
			  Session session = factory.getCurrentSession();	
			  
	    	   Student student=new Student();
	    	   University university=new University();
	    	   student.setFirstName("Pooja");
	    	   student.setLastName("Yadav");
	    	   student.setSection("Science");
	    	   university.add(student);
	    	   
	    	   Student student1=new Student();
	    	   student1.setFirstName("chetan");
	    	   student1.setLastName("sharma");
	    	   student1.setSection("commerce");
	    	   university.add(student1);
	    	   university.setName("VIT");
	    	   university.setCountry("India");
	    	   student.setUniversity(university);
	    	   session.getTransaction().begin();
	    	   session.persist(university);
	    	   session.getTransaction().commit();
	    	   
	    	   
	    	   logger.info("Done!");
	       }catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }	
	
}
}