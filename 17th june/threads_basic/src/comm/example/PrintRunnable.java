package comm.example;


// one difference between Thread interface and Runnable interface is 
// in thread interface : overridden method isn't compulsory to use
// in runnable interface it's compulsory.
public class PrintRunnable implements Runnable {

	private String name;
	private Thread thread;
	
public PrintRunnable(String name) {
		
		this.name = name;
		thread=new Thread(this,name); // we can call thread from here also, instead of main
		System.out.println(thread.getName());
		thread.start();
	}
	
	
	@Override
	public void run() {
		
		for(int i=0;i<100;i++)
		{
			System.out.println(name+" "+i);
		}
		
	}

}
