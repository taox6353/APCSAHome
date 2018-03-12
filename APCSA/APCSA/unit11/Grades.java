package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private Grade[] gradeList;
	//constructors
	public Grades(){
		gradeList = new Grade[0];
	}
	public Grades(String grades){
		setGrades(grades);
	}

	public void setGrades(String values){
		Scanner scan = new Scanner(values);
		int numGrades = scan.nextInt();
		
		gradeList = new Grade[numGrades];
		
		String throwAway = scan.next();//Takes in "-"
		
		for(int i=0;i<numGrades;i++){
			//Grade g = new Grade(Double.parseDouble(scan.next()));
			double dbl = Double.parseDouble(scan.next());
			gradeList[i]=new Grade(dbl); //Seems to override previous numbers...is it referring to same object?
			System.out.println(Arrays.toString(gradeList));
			
		}
		System.out.println(Arrays.toString(gradeList));
		
	}
	public void setGrade(int spot, double gr){
		
		Grade g = new Grade(gr);
		gradeList[spot]=g;
		
	}
	public double getSum(){
		double sum = 0.0;
		for(int i=0;i<gradeList.length;i++){
			sum = sum + gradeList[i].getNumericGrade();
		}
		
		return sum;
	}
	public double getLowGrade(){
		double lowest = gradeList[0].getNumericGrade();
		for(int i=1;i<gradeList.length;i++){
			if(gradeList[i].getNumericGrade() <= lowest)
				lowest = gradeList[i].getNumericGrade();
			
		}
		return lowest;
	}
	public double getHighGrade(){
		double highest = gradeList[0].getNumericGrade();
		for(int i=1;i<gradeList.length;i++){
			//System.out.print(highest);
			if(gradeList[i].getNumericGrade() >= highest)
				highest = gradeList[i].getNumericGrade();
		}
		return highest;
	}
	public int getNumGrades(){
		return gradeList.length;
	}
	//toString method
	public String toString(){
		String output = "";
	
		return output;
	}




}

