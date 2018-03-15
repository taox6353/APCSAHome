package unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("APCSA\\unit12\\lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		WordV[] wordlist = new WordV[size];
		
		for(int i=0;i<size;i++){
			wordlist[i] = new WordV(file.nextLine());
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(wordlist[j].compareTo(wordlist[j+1])==1){
					WordV temp = wordlist[j+1];
					wordlist[j+1]=wordlist[j];
					wordlist[j]=temp;
				}
			}
		}
		
		for(int i=0;i<wordlist.length;i++){
			System.out.println(wordlist[i].toString());
		}
		
	}
}