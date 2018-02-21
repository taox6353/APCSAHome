package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
 {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a :: ");
		int a = scan.nextInt();
		
		System.out.println("Enter b :: ");
		int b = scan.nextInt();
		
		System.out.println("Enter c :: ");
		int c = scan.nextInt();
		
		Quadratic quad = new Quadratic(a,b,c);
		quad.calcRoots(); 
		quad.print();
	}
}