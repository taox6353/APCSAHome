package unit6;

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover lr = new LetterRemover("abababababa",'b');
		out.println(lr);
		out.println();
		
		lr.setRemover("I am Sam I am", 'a');
		out.println(lr);											
	}
}