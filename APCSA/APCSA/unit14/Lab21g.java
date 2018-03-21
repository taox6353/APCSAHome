package unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter ac = new AtCounter();
		
		//test the code
		int x=0;
		int y=0;
		ac.countAts(x, y);
		System.out.println(x+" "+y+" has "+ac);
		
		AtCounter ac1 = new AtCounter();
		x=2;
		y=5;
		ac1.countAts(x, y);
		System.out.println(x+" "+y+" has "+ac1);
		
		AtCounter ac2 = new AtCounter();
		x=5;
		y=0;
		ac2.countAts(x, y);
		System.out.println(x+" "+y+" has "+ac2);
		
		AtCounter ac3 = new AtCounter();
		x=9;
		y=9;
		ac3.countAts(x, y);
		System.out.println(x+" "+y+" has "+ac3);
		
		AtCounter ac4 = new AtCounter();
		x=3;
		y=9;
		ac4.countAts(x, y);
		System.out.println(x+" "+y+" has "+ac4);
	}
}