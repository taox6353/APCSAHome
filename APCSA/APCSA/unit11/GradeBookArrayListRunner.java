package unit11;

import java.util.Arrays;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

class GradeBookArrayListRunner {
  public static void main(String[] args) {
    out.println("Welcome to the Class Stats program!");
    
    try {
      //Open the file.Data.txt
      FileReader dataFile = new FileReader("gradebook.txt");
      BufferedReader buff = new BufferedReader(dataFile);
      
      String className = buff.readLine();
		  int numStudents = Integer.parseInt(buff.readLine());
		  
		  Class theClass = new Class(className, numStudents);
		
  		for(int i=0; i<numStudents; i++)
  		{
  			String stuName = buff.readLine();
  			String gradeList = buff.readLine();
  			System.out.println(theClass);
  			theClass.addStudent(i,new Student(stuName, gradeList));//**BROKEN HERE**
  			//System.out.println(theClass.get(0));
  		}
  		
  		out.println("\n\n"+theClass);
  		theClass.sort();
  
  		out.println("\n\n"+theClass);
  		
  		out.println("Failure List = " + theClass.getFailureList(70));	
  		out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
  		out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());
  		
  		out.println("Class average = " + theClass.getClassAverage());
      
      
      //Close the BufferedReader and FileReader.
      buff.close();
      dataFile.close();
    }
    catch(FileNotFoundException e) {
      System.out.println("The data file gradebook.txt was not found or could not be opened.");
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}