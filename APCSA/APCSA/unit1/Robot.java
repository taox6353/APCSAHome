package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);

      //add more code here
      
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.setColor(Color.GREEN);
      window.fillOval( 50, 50, 100, 100 );

		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval( 60, 80, 20, 20);
      window.fillOval( 120, 80, 20, 20);
      
      window.setColor(Color.BLUE);
      window.fillOval(90, 90, 10, 10);
      
      window.setColor(Color.YELLOW);
      window.drawArc(70, 100, 60, 30, 0, -180);
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.DARK_GRAY);
	   window.drawRect(0, 140, 30, 150); //leftarm
	   window.fillRect(0, 140, 30, 150);
	   window.drawRect(150, 140, 30, 150); //rightarm
	   window.fillRect(150, 140, 30, 150);
	   
	   window.setColor(Color.CYAN);
	   window.drawRect(30, 150, 120, 200); //body
	   window.fillRect(30, 150, 120, 200);
	   
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.MAGENTA);
	   window.drawRect(30, 350, 30, 120); //leftleg
	   window.fillRect(30, 350, 30, 120);
	   window.drawRect(120, 350, 30, 120); //rightleg
	   window.fillRect(120, 350, 30, 120); 

   }
}