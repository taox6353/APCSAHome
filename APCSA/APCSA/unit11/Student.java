package unit11;

import java.util.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	//constructors
	public Student(){
		setName("");
		setGrades("");
	}
	public Student(String student,String grades){
		setName(student);
		setGrades(grades);
	}
	public void setName(String name){
		myName = name;
	}
	public void setGrades(String gradeList){
		myGrades = new Grades(gradeList);
	}
	public void setGrade(int spot, double grade){
		myGrades.setGrade(spot,grade);
	}
	public String getName()
	{
		return myName;
	}
	public int getNumGrades(){
		
		return myGrades.getNumGrades();
	}
	public double getSum(){
		
		return myGrades.getSum();
	}
	public double getAverage(){
		
		return getSum()/getNumGrades();
	}
	public double getAverageMinusLow(){
		
		return (getSum() - myGrades.getLowGrade())/(getNumGrades()-1);
	}
	public double getHighGrade(){
		
		return myGrades.getHighGrade();
	}
	public double getLowGrade(){
		
		return myGrades.getLowGrade();
	}
	public boolean equals(Object obj)
	{
		Student sOther = (Student)obj;
		if(this.getAverage()==sOther.getAverage()){
			return true;
		}
		return false;
	}
	public int compareTo(Object obj)
	{
		Student sOther = (Student)obj;
		
		return ((int)this.getAverage()-(int)sOther.getAverage());
	}
	//toString
	public String toString(){
		String output = myName + " = " + myGrades.toString();
		
		return output;
	}
}