package misc;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		int ans = (int) (Math.random()*upperBound+1); 
		int guess; 
		int i = 0;
		do{
			System.out.print("Enter a number between 1 and " + upperBound + " ");
			guess = keyboard.nextInt();
			
			if (guess > upperBound||guess < 1)
				System.out.println("Number out of range!");
			else if(guess != ans)
				i++;
		}while(guess != ans);
		
		int percwrong = (int)((((double)i)/upperBound)*100);
		
		System.out.println("\nIt took " + i + " guesses to guess "+ ans + ".");
		System.out.println("You guessed wrong " + percwrong + " percent of the time.\n\n");


	}

	public String toString()
	{
		String output="";
		return output;
	}
}

