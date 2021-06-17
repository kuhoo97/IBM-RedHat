package comm.example.app;


import comm.example.PrintThreadGroup;

public class ThreadGroupTest {

	public static void main(String[] args) {
		
	new PrintThreadGroup("A").start();
	new PrintThreadGroup("B").start();
	new PrintThreadGroup("C").start();
	new PrintThreadGroup("D").start();
	
	ThreadGroup group = Thread.currentThread().getThreadGroup();
	
	Thread[] tarray = new Thread[10];
	int actualSize = group.enumerate(tarray);  //will take array size of thread group
	for (int i = 0; i < actualSize; i++) {
	System.out.println("Thread " + tarray[i].getName() + " in thread group " + group.getName());
	}		
		
}
	
	
	
}
