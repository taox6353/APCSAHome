package unit4;

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";
	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{
		char letter = c;
		if (word.indexOf(letter) >= 0){
			return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		String subS = s;
		if (word.contains(subS)){
			return true;
		}
		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}