package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		char response = 'y';
		GuessingGame gg = new GuessingGame(response);
		Scanner keyboard = new Scanner(System.in);

		do{
			gg.playGame();
			System.out.print("Do you want to play again?");
			String reply = keyboard.next();
			response = reply.charAt(0);
			
		}while(response == 'y');
		System.out.println();
		





	}
}
