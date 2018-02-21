package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		//add test cases
		
		System.out.println("Enter X1:: ");
		int x1 = scan.nextInt();
		
		System.out.println("Enter Y1:: ");
		int y1 = scan.nextInt();
		
		System.out.println("Enter X2:: ");
		int x2 = scan.nextInt();
		
		System.out.println("Enter Y2:: ");
		int y2 = scan.nextInt();
		
		Distance dist = new Distance(x1,y1,x2,y2);
		dist.calcDistance();
		dist.print();	
	}
}