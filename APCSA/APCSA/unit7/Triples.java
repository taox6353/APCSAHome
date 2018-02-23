package unit7;

import java.lang.System.*;
import java.lang.Math;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
		toString();
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		
		for(int i=2;i<number;i++){
		  if(a%i==0 && b%i==0 && c%i==0){
		    max = 0;
		  }
		}
		if (max == 0)
		    return 0;
		  else
		    return 1;
	}

	public String toString()
	{
		String output="";
		
		for(int a=1;a<=number;a++){
		  for (int b=1;b<=number;b++){
		    for (int c=1;c<=number;c++){
		      if (a<b && a<c && Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) && c%2==1 && greatestCommonFactor(a,b,c)==1){
		        if ((a%2==1 && b%2==0)||(a%2==0 && b%2==1)){
		            output = output + a +" "+  b +" "+ c+ "\n";
		        }
		      }
		      
		    }
		  }
		}
		return output+"\n";
	}
}
