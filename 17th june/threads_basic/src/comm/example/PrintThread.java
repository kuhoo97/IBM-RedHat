package comm.example;

/// this is another implementation 


public class PrintThread extends Thread {

	
	public PrintThread(String name)
	{
		super(name);
		
		// we can also call start() from here, instead of main.
		
		start();
	}

	@Override
	public void run() {
		
	//getName is a main method, thread acts like an array 
		// and takes the name automatically
       String name=getName();
		
		for(int i=0;i<100;i++)
		{
			System.out.println(name+"-->"+i);
			
		}
	}

}
	

