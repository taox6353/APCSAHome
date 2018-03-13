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
			gradeList[i]=new Grade(Double.parseDouble(scan.next()));
		}
		
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
		
		for(int i=0;i<gradeList.length;i++){
			output = output + gradeList[i].getNumericGrade() + " ";
		}
		
		return output;
	}

}