package unit11;

public class Grade
{
	private static double value;
	//add in two constructors
	public Grade()
	{
		value = 0;
	}
	public Grade(double grade)
	{
		setNumericGrade(grade);
	}
	//add in set and get methods
	//double getNumericGrade()	
	public static void setNumericGrade(double grade){
		value = grade;
	}

	public static double getNumericGrade(){
		return value;
	}
	//String getLetterGrade()
	public static void setLetterGrade(){
		String LetterGrade = "E";
	
	}
	public static String getLetterGrade(){
		String LetterGrade = "";
		if(value>=90.0)
			LetterGrade = "A";
		else if(value>=80.0&&value<=89.99)
			LetterGrade = "B";
		else if(value>=70.0&&value<=79.99)
			LetterGrade = "C";
		else if(value>=60.0&&value<=69.99)
			LetterGrade = "D";
		else
			LetterGrade = "F";
		return LetterGrade;
		
	}
	//toString method
	public String toString(){
		String string = getNumericGrade()+"\n"+getLetterGrade();
		
		return string;
		
		
	}
}

