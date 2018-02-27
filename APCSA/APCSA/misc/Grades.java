package misc;

import java.util.*;

public class Grades {
	//instance variables

		static int arraySize;
		static String passedGrds;
		static double[] grades;

		//constructor
		public Grades(int num, String grd)
		{
		setGrades(num,grd);
		  
		}
		//set method
		public void setGrades(int num, String grd)
		{
		  arraySize = num;
		  passedGrds = grd;
		  grades = new double[arraySize];
		  passedGrds = passedGrds.trim();
		  
		  Scanner scan = new Scanner(passedGrds);
		  
		  if(scan.hasNextDouble()){
			    for(int i=0;i<arraySize;i++){
			    grades[i] = scan.nextDouble();
			  }
			  }
			  else{
			    for(int i=0;i<arraySize;i++){
			    grades[i] = scan.nextInt();
			  }
			  }
		  
		  //grades = grades1;
		  //System.out.println(grades);
		  
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
			average = getSum()/arraySize;
			return average;
		}
		public String toString()//toString method
		{
			String print = "";
			for(int i=0;i<arraySize;i++){
			  //System.out.println(grades);
				print = print + "grade "+ i +" :: "+ grades[i] +"\n";
			}
			print = print + "\naverage = " + getAverage();
			
			return print;
		}
}
