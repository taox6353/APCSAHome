package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	
	double[] grades;
	int arraySize;

	//constructor
	public Grades()
	{
		arraySize = 0;
	}
	//set method
	public void setGrades(double[] grad)
	{
		grades = grad;
		arraySize = grades.length;
	}
	private double getSum()
	{
		double sum=0.0;
		
		for(int i=0;i<grades.length;i++){
			sum = sum + grades[i];
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;
		
		return average;
	}
	public String toString()//toString method
	{
		String print = "";
		
		for(double i=0;i<grades.length;i++){
			print = print + "grade "+ (int)i +" :: "+ grades[(int)i]+"\n";
		}
		print = print + "\naverage = " + getAverage();
		
		return print;
	}


}