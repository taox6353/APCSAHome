package unit2;

import java.util.Scanner;

class RunwayCalculationTester {
  
  static float speed;
  static float acceleration;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter speed :: ");
    speed = scan.nextFloat();
    
    System.out.println("Enter acceleration :: ");
    acceleration = scan.nextFloat();
    
    RunwayCalculator runwcalc = new RunwayCalculator(speed, acceleration);
    runwcalc.calcRunway();
    System.out.println("The minimum runway length for this airplane is " + runwcalc.print());
    
  }
}