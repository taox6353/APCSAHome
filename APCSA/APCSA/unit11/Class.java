package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList=new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum]=s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		
		for(int i=0;i<studentList.length;i++){
			classAverage = classAverage + studentList[i].getAverage();
		}
		classAverage = classAverage/studentList.length;
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i=0;i<studentList.length;i++){
			if(studentList[i].getName().equals(stuName))
				return studentList[i].getAverage();
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		/*double high = Double.MIN_VALUE;
		String hName ="";
		for(int i=0;i<studentList.length;i++){
			if(studentList[i].getAverage()>high){
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
				
		}*/
		this.sort();
		
		return studentList[studentList.length-1].getName();
	}

	public String getStudentWithLowestAverage()
	{
		/*double low = Double.MAX_VALUE;
		String hName ="";
		for(int i=0;i<studentList.length;i++){
			if(studentList[i].getAverage()<low){
				low = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}*/
		this.sort();
		return studentList[0].getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i=0;i<studentList.length;i++){
			if(studentList[i].getAverage()<=failingGrade){
				output = output + studentList[i].getName()+ " ";
			}
		}

		return output;
	}
	public void sort(){
		for (int i = 0; i < studentList.length; i++) {
	        for (int j = i + 1; j < studentList.length; j++) {
	            Student tmp;
	            if (studentList[i].getAverage() > studentList[j].getAverage()) {
	                tmp = studentList[i];
	                studentList[i] = studentList[j];
	                studentList[j] = tmp;
	            }
	        }
	    }
	}
	
	public String toString()
	{
		String output=getClassName()+"\n";
		for(int i=0;i<studentList.length;i++){
			output = output + studentList[i].toString() + "\t"+ String.format("%.2f",studentList[i].getAverage()) +"\n";
		}

		return output;
	}  	
}