package org.example.demo;

import org.example.demo.model.Coach;

import org.example.demo.model.Employee;
import org.example.demo.model.InternationalCD;
import org.example.demo.model1.InternationalcD;
import org.example.demo.model1.MyInterface;
import org.example.demo.model1.SpecialeditionCD;
import org.example.demo.model2.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.demo.model1.CD1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");		
    	//	Coach theCoach=context.getBean("theCoach",Coach.class);
        //	System.out.println(theCoach.getDailyworkOut());
        //	Coach theCoach2=context.getBean("theCoach",Coach.class);
        //	System.out.println(theCoach==theCoach2);	
    		
    		// so one object is created and we can configure it, through xml file.
        	// theCoach is the object , by changing the name of class in xml, we can create 
        	// object for that class.
        	
    		
    //creating employee object and initiating it's value in constructor in xml file		
			/*
			 * Employee employee = context.getBean("emp",Employee.class);
			 * System.out.println(employee.getDetails()); employee.setId("2");
			 * employee.setName("Second"); System.out.println(employee.getDetails());
			 */
    		
     //using CD abstract class and initializing International and special cd class constructors in xml   	
        	
			/*
			 * InternationalCD cd = context.getBean("theCD", InternationalCD.class);
			 * System.out.println(cd.getDetails()); cd.setCdId(101);
			 * cd.setCdName("Godzila"); cd.setLanguage("Russian");
			 * System.out.println(cd.getDetails());
			 */
			
	// MY Interface class, CD1 class and SpecialeditionCD and InternalionalcD extends CD1 and implements My interface		
        	
			/*
			 * MyInterface allCD = context.getBean("newCD",MyInterface.class);
			 * System.out.println(allCD.getCdDetails()); MyInterface allCD1 =
			 * context.getBean("newCD1",MyInterface.class);
			 * System.out.println(allCD1.getCdDetails());
			 */
			
			
	//	implementing constructor injection and setter injection
    // we are using fortune class to do that here.
        	
        	MyInterface tempFace = context.getBean("theDay",InternationalcD.class);
			System.out.println(tempFace.getDailyFortune());
			
			MyInterface tempFace1 = context.getBean("theDay1",SpecialeditionCD.class);
			System.out.println(tempFace1.getDailyFortune());
			
			
  /// Applying on Customer and address class
			Customer cus = context.getBean("theCustomer",Customer.class);
			System.out.println(cus);
        	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    	
    	
    }
}
