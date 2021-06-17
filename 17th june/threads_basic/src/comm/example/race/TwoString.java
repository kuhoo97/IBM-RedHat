package comm.example.race;

public class TwoString {

	//if we don't use synchronized then the 
	//thread won;t be locked and it will 
	//execute randomly
	
	//try removing synchronized and then again using it.
	public synchronized static void print(String str1,String str2)
	{
		System.out.print(str1+" ");
		try {
			Thread.sleep(5000); //sleep for 5 sec
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(str2);
	}
	
	
	
	
	
}
