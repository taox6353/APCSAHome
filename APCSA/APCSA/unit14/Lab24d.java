package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("APCSA\\unit14\\Lab24d.dat"));
		
		int numBoards = file.nextInt();
		file.nextLine();
		
		for(int i=0;i<numBoards;i++){
			TicTacToe ttt = new TicTacToe(file.nextLine());
			System.out.println(ttt.toString());
		}
		
	}
}
