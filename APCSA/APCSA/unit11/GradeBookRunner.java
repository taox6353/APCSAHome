package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		out.println("What is the name of this class? ");
		String className = keyboard.nextLine();
		
		out.println("How many students are in this class? ");
		int classNum = keyboard.nextInt();
		
		Class class1 = new Class(className,classNum);
		
		String throwAway = keyboard.nextLine();
		
		for(int i=0;i<classNum;i++){
			out.println("Enter the name of student "+ i + " : ");
			String stuName = keyboard.nextLine();
			
			out.println("Enter the grades for "+ stuName + "\nUse the format x - grades ( 2 - 100 100) : ");
			String stuGrades = keyboard.nextLine();
			
			class1.addStudent(i, new Student(stuName,stuGrades));
		}
		
		System.out.println();
		System.out.println(class1);
		out.println("Failure List = " + class1.getFailureList(70));	
		out.println("Highest Average = " + class1.getStudentWithHighestAverage());
		out.println("Lowest Average = " + class1.getStudentWithLowestAverage());
		out.println(String.format("Class Average = %.2f",class1.getClassAverage()));
		
   }
   
   
}