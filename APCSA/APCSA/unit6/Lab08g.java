package unit6;

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats looper = new LoopStats(1,5);
		out.println(looper);
		
		looper.setNums(2, 8);
		out.println(looper);
	}
}