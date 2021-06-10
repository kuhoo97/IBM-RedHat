package comm.example.app;

import java.util.Scanner;

import comm.example.Friend;
import comm.example.Family;
// to only print with using out.println
import static java.lang.System.out;
// to only use in instead of System.in in Scanner
import static java.lang.System.in;

import static comm.example.Friend.loveScale;
import static comm.example.FriendType.BESTFRIEND;
import static comm.example.FriendType.FRENEMY;


public class App {
	
	private static Scanner scanner=new Scanner(in);
	private Friend[] friends;
	
	{
		friends = new Friend[2];
	}
	
	public static void main(String args[])
	{
		int newScale = loveScale;
		System.out.println(newScale);
		App app=new App();
		
		//heterogenous array declaration
		app.friends[0]= new Friend(1,"John",BESTFRIEND);
		app.friends[1]= new Family(2, "Lily",FRENEMY,"NO");
		
		// enhanced for loop
		
		for(Friend friend: app.friends)
		{
			out.println(friend);
		}
		
		//standard for loop
		
	/*	for(int i =0; i<app.friends.length;i++)
		{
			out.println(app.friends[i]);
		}
		*/
	}

}
