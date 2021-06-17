package comm.example.app;


//import comm.example.ThreadTest;
import comm.example.PrintThread;
import comm.example.PrintRunnable;

public class App {
	
	public static void main(String[] args) {
		/*
		ThreadTest test = new ThreadTest();
		
		Thread t = new Thread(test);
		System.out.println(t.getName());
		t.start();
		
		Thread t1=new Thread(test);
		System.out.println(t1.getName());
		t1.start();
		Thread t2=new Thread(test);
		t2.start();
		*/
		
	//	PrintThread thread1=new PrintThread("A");
//******		new PrintThread("A"); // we can directly create orphan objects using this
		//	thread1.start(); calling this in constructor
	//	PrintThread thread2=new PrintThread("B");
//******		new PrintThread("B");
	//	thread2.start();
		
		
		
		
		// either we can use this or declare thread directly in the constructor
	/*
		PrintRunnable printRunnable=new PrintRunnable("A");
		  Thread t1=new Thread(printRunnable); 
		  t1.start();
		  PrintRunnable printRunnable1=new PrintRunnable("B");
		  Thread t2=new Thread(printRunnable1); t2.start();
	*/
		
	//	this is the approach
		new PrintRunnable("A");
		new PrintRunnable("B");
		
		
	}
	
	

}
