package org.example.spring_annotations_ioc;

import org.example.spring_annotations_ioc.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		@SuppressWarnings("resource")
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Person person=context.getBean("thePerson",Person.class);
    		//@Values values will be printed as parameterized constructor
    		System.out.println(person);
    		
    		person.setEmail("john@email.com");
    		person.setFirstName("john");
    		person.setLastName("doe");
    		person.setPersonId(100);
    		System.out.println(person);
    		
    		//After removing Scope person==person1 will come true. Because same object will be updated
			
    		Person person1 = context.getBean("thePerson", Person.class);
			System.out.println(person1);
			System.out.println(person==person1);
    		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    }
}
