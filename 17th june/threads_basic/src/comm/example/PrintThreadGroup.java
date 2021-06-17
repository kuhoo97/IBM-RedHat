package comm.example;

public class PrintThreadGroup extends Thread {

	public PrintThreadGroup(String name)
	{
		super(name);
	}

	@Override
	public void run() {
		
		String name=getName();
		System.out.println(name);
		
		
	}
	
	
	
	
}
