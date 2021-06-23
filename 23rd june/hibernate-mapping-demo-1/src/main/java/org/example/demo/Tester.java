package org.example.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.example.demo.model.Address;
import org.example.demo.model.Instructor;
import org.example.demo.model.InstructorDetails;
import org.example.demo.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Tester {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("org.example.demo.Tester.class");
	
		 try {
			  
			  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Address.class) .buildSessionFactory(); 
			  
			  Session session = factory.getCurrentSession();	
			  
			  // Create
			  
			  Address address = new Address();
				address.setStreet("King");
				address.setCity("Mumbai");
			    User user = new User();
			    user.setUserName("pooja");
			    address.setUser(user);
				user.setAddress(address);
				session.getTransaction().begin();
				session.persist(address);
				session.persist(user);
				session.getTransaction().commit();
				logger.info("done");
			  
				
				// For display
				
				session = factory.openSession();
				List<User> list = new ArrayList<User>();
				Query query = session.createQuery("select e from user e");
				
				list = query.getResultList();
				Iterator<User> i = list.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				
				//for delete 
				
				 session.getTransaction().begin(); 
				  user=session.get(User.class, 2);
				  session.delete(user);
				  
				   session.getTransaction().commit();
				  System.out.println("done");
			  
			  
			  
			  } catch (Exception e) 
			  { 
				  // TODO: handle exception 
				  e.printStackTrace(); 
	 }
		
		
		
		
		
		
		
	
}
}