package unit8;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		number = 0;
		String ripped = "";
		for (int i=0;i<roman.length();i++){
			ripped = roman.substring(i, i+1);
			
			if(i <= roman.length()-2&&(roman.substring(i).compareTo("IX") == 0||(roman.substring(i)).compareTo("IL") == 0)){
				ripped = roman.substring(i);
				for (int j=0;j<LETTERS.length;j++){
					if(ripped.compareTo(LETTERS[j]) == 0){
						number = number + NUMBERS[j];
						i++;}}}
			else if(i<=roman.length()-2&&(roman.substring(i,i+2).compareTo("XL") == 0||roman.substring(i,i+2).compareTo("XC") == 0)){
				ripped = roman.substring(i,i+2);
				for (int j=0;j<LETTERS.length;j++){
					if(ripped.compareTo(LETTERS[j]) == 0){
						number = number + NUMBERS[j];
						i++;}}}
			
			else
				for (int k=0;k<LETTERS.length;k++){
					if(ripped.compareTo(LETTERS[k]) == 0){
						number = number + NUMBERS[k];
					
					}
				}
				}
		return number;
	}

	public String toString()
	{
		roman = "";
		for (int i=0;i<NUMBERS.length;i++){
			if (number == NUMBERS[i])
				roman = LETTERS[i];
		}
		if(roman==""){
			for (int i=0;i<NUMBERS.length;){
			
			if (number>=NUMBERS[i]){
				roman = roman+LETTERS[i];
				number = number - NUMBERS[i];
				i=0;
			}
			else
				i++;
		}
		}
		
		
		
		
		return roman + "\n";
	}
}