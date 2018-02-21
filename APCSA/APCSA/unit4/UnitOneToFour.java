package unit4;

/*
Copy the code from your homework labs into the UnitOneToFour class constructors and methods
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class UnitOneToFour {
	private int xOne, yOne, xTwo, yTwo;
	private int a, b, c;
	private double slope;
	private double rootOne;
	private double rootTwo;
	private String name;

	public UnitOneToFour(int x1, int y1, int x2, int y2, int numA, int numB, int NumC, String n) {
	  x1 = 0;
	  y1 = 0;
	  x2 = 0;
	  y2 = 0;
	  numA = 0;
	  numB = 0;
	  NumC = 0;
	  name = "";
	}

	public void setValues(int x1, int y1, int x2, int y2, int numA, int numB, int NumC, String n) {
	  xOne = x1;
	  yOne = y1;
	  xTwo = x2;
	  yTwo = y2;
	  a = numA;
	  b = numB;
	  c = NumC;
	  name = n;
	}

	public void calculateSlope() {
	  slope = (yTwo - yOne)/(xTwo - xOne);
	  System.out.println(String.format("%.2",slope));
	}

	public void calcRoots() {
	  rootOne = (-b + (Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
	  rootTwo = (-b - (Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
	  System.out.println("Root1 = " + String.format("%.2",rootOne));
	  System.out.println("Root2 = " + String.format("%.2",rootTwo));
	}

	public String getFirst() {
	  int index = name.indexOf(" ");
		return name.substring(0, index);
	}

	public String getLast() {
		int index = name.indexOf(" ");
		return name.substring(index+1, name.length());
	}
	public void print() {
    /*
      Build a print statement that will show the following:
      * Print your first and last name using the getFirst & getLast methods
      * Print the slope variable after running calculateSlope (format tow show two decimal places)
      * Print rootOne & rootTwo after running calcRoots (format tow show two decimal places)
    */
    System.out.println(getFirst()+" "+getLast());
    calculateSlope();
    calcRoots();
    
	}
	
	//*************** Unit 1 Exercises ****************
	/*
	  Add methods or code below from your unit 1 Exercise solutions (Rectangle, HelloPrinter, DieSimulator)
	*/
	
	//Rectangle Exercise
class Main {
public void main(String[] args) {
  
  areaRectangle();
  System.out.println("");
  perimRectangle();
  
}
public void horizontalOne() {
  System.out.println("******");
}
public void horizontalTwo() {
  System.out.print("******");
}
public void areaRectangle(){
  int rectLen = 6;
  int rectWid = 7;
  
  horizontalOne();
  horizontalOne();
  horizontalOne();
  horizontalOne();
  horizontalOne();
  horizontalOne();
  horizontalOne();
  
  System.out.println("The rectangle's length is "+rectLen);
  System.out.println("The rectangle's width is "+rectWid);
  
}
public void perimRectangle(){
  int rectLen = 12;
  int rectWid = 2;
  
  horizontalTwo();
  horizontalTwo();
  System.out.println("");
  horizontalTwo();
  horizontalTwo();
  System.out.println("");
  
  System.out.println("The rectangle's length is "+rectLen);
  System.out.println("The rectangle's width is "+rectWid);
}
}

//HelloPrinter Exercise

class HelloPrinter {

String str;

public void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  System.out.println("This program switches 'o' and 'e' in strings. Give it a try:");
  str = scan.nextLine(); 
  replace();
  
}
public void replace() {
  
  String str1 = str.replaceAll("e", "@");
  String str2 = str1.replaceAll("o", "e");
  String str3 = str2.replaceAll("@", "o");
  
  System.out.println(str3);
}
}

//DieSimulator Exercise

class DieSimulator {

int roll;

public void main(String[] args) {
  
  nextInt();
  System.out.println(roll);
  
}
public void nextInt() {
  Random rng = new Random();
  roll = rng.nextInt(7);
}
}

	//*************** End Unit 1 Exercises ****************
	
	

}//end of UnitOneToFourClass




//*************** Unit 2 Exercises ****************
/*
Add methods or code below from your unit 2 Exercise solutions (SavingsAccount)
*/

//SavingsAccount class
class SavingsAccount
{
  private double balance;
  private double interest;

  //Constructs a bank account with a zero balance. 
  public SavingsAccount()
  {
      balance = 0;
      interest = 0;
  }

   //Constructs a bank account with a given balance. @param initialBalance the initial balance
  public SavingsAccount(double initialBalance, double initialInterest)
  {
      balance = initialBalance;
      interest = initialInterest;
  }

  //Deposits money into the bank account. @param amount the amount to deposit
  public void deposit(double amount)
  {
      balance = balance + amount;
  }

  //Withdraws money from the bank account. @param amount the amount to withdraw
  public void withdraw(double amount)
  {
      balance = balance - amount;
  }

  //Gets the current balance of the bank account. @return the current balance
  public double getBalance()
  {
      return balance;
  }
  //Adds interest to the balance
  public void addInterest()
  {
    balance = (1+(interest/100)) * balance;
  }
}

//*************** End Unit 2 Exercises ****************
	
class Main {
public static void main(String[] args) {
  
  //Instantiate an object of the UnitOneToFour class using the following test values
  //Line: x1:4, y1:4, x2:5, y2:3 --> should have a slope of -1
  //Quadratic: a:9, b:6, c:1 --> should have two roots of -0.33
  //Name: your full name as one string
  //Call print method to show the results
  UnitOneToFour u14 = new UnitOneToFour(0, 0, 0, 0, 0, 0, 0, null);
  
  u14.setValues(4,4,5,3,9,6,1,"Xavier Tao");
  u14.print();
  
  
  //*************** Unit 2 Exercises ****************
  /*
    Add methods or code below from your unit 2 Exercise solutions (SavingsAccountTester, Physics)
  */
  
  //SavingsAccountTester Code (do not add another main method)
  SavingsAccount sacct = new SavingsAccount(1000,10);
  
  sacct.addInterest();
  System.out.println(sacct.getBalance());
  
  //physics code
  float vTakeOff;
  float aTakeOff;
  double runwayLength;

  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter speed :: ");
  vTakeOff = scan.nextFloat();
  
  System.out.println("Enter acceleration :: ");
  aTakeOff = scan.nextFloat();
  
  runwayLength = (vTakeOff*vTakeOff)/(2*aTakeOff);
  
  System.out.println("The minimum runway length for this airplane is " + String.format("%.3f",runwayLength));
  
  //*************** End Unit 2 Exercises ****************
  
}
}