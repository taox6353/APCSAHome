package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		//System.out.println(System.getProperty("user.dir"));
		String theFile = "APCSA\\unit11\\gradebook.dat";
		Scanner file = new Scanner(new File(theFile));
		
		String className = file.nextLine();
		int classNum = file.nextInt();
		file.nextLine();
		
		Class class1 = new Class(className,classNum);
		
		for(int i=0;i<classNum;i++){
			String stuName = file.nextLine();
			String stuGrades = file.nextLine();
			
			class1.addStudent(i, new Student(stuName,stuGrades));
		}
		
		System.out.println();
		System.out.println(class1);
		
		System.out.println();
		class1.sort();
		System.out.println(class1);
		
		out.println("Failure List = " + class1.getFailureList(70));	
		out.println("Highest Average = " + class1.getStudentWithHighestAverage());
		out.println("Lowest Average = " + class1.getStudentWithLowestAverage());
		out.println(String.format("Class Average = %.5f",class1.getClassAverage()));
		
	}		
}