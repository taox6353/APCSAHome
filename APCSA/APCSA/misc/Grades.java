package misc;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Grade> gradeList;
	//constructors
	public Grades(){
		gradeList.add(new Grade());
	}
	public Grades(String grades){
		setGrades(grades);
	}

	public void setGrades(String values){
		Scanner scan = new Scanner(values);
		int numGrades = scan.nextInt();
		
		gradeList = new ArrayList<Grade>(numGrades);
		
		String throwAway = scan.next();//Takes in "-"
		
		System.out.println(gradeList);
		
		for(int i=0;i<numGrades;i++){
			gradeList.add(i,new Grade(Double.parseDouble(scan.next())));
		}
		
	}
	public void setGrade(int spot, double gr){
		
		Grade g = new Grade(gr);
		gradeList.set(spot, g);
		
	}
	public double getSum(){
		double sum = 0.0;
		for(int i=0;i<gradeList.size();i++){
			sum = sum + gradeList.get(i).getNumericGrade();
		}
		
		return sum;
	}
	public double getLowGrade(){
		double lowest = gradeList.get(0).getNumericGrade();
		for(int i=1;i<gradeList.size();i++){
			if(gradeList.get(i).getNumericGrade() <= lowest)
				lowest = gradeList.get(i).getNumericGrade();
			
		}
		return lowest;
	}
	public double getHighGrade(){
		double highest = gradeList.get(0).getNumericGrade();
		for(int i=1;i<gradeList.size();i++){
			if(gradeList.get(i).getNumericGrade() >= highest)
				highest = gradeList.get(i).getNumericGrade();
		}
		return highest;
	}
	public int getNumGrades(){
		return gradeList.size();
	}
	//toString method
	public String toString(){
		String output = "";
		
		for(int i=0;i<gradeList.size();i++){
			output = output + gradeList.get(i).getNumericGrade() + " ";
		}
		
		return output;
	}
}
