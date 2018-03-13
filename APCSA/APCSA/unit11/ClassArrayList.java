package unit11;

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class ClassArrayList
{
	private String name;
	private ArrayList<Student> studentList;
	
	public ClassArrayList()
	{
		name="";
	}
	
	public ClassArrayList(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		
		for(int i=0;i<studentList.size();i++){
			classAverage = classAverage + studentList.get(i).getAverage();
		}
		classAverage = classAverage/studentList.size();
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i=0;i<studentList.size();i++){
			if(studentList.get(i).getName().equals(stuName))
				return studentList.get(i).getAverage();
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
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
		
		return studentList.get(studentList.size()-1).getName();
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
		return studentList.get(0).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i=0;i<studentList.size();i++){
			if(studentList.get(i).getAverage()<=failingGrade){
				output = output + studentList.get(i).getName()+ " ";
			}
		}

		return output;
	}
	public void sort(){
		for (int i = 0; i < studentList.size(); i++) {
	        for (int j = i + 1; j < studentList.size(); j++) {
	            Student tmp;
	            if (studentList.get(i).getAverage() > studentList.get(j).getAverage()) {
	                tmp = studentList.get(i);
	                studentList.set(i, studentList.get(j));
	                studentList.set(j, tmp);
	            }
	        }
	    }
	}
	
	public String toString()
	{
		String output=getClassName()+"\n";
		for(int i=0;i<studentList.size();i++){
			output = output + studentList.get(i).toString() + "\t"+ String.format("%.2f",studentList.get(i).getAverage()) +"\n";
		}

		return output;
	}  	
}