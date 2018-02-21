package unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape() 
   {
		
   }


   public void draw(Graphics window)
   {
      window.setColor(color.BLACK);
      window.fillRect(xPos, yPos, width, height);

      window.setColor(color.CYAN);
      window.fillRect(60, 60, 40, 40);
      
      window.setColor(color.GREEN);
      window.fillRect(70, 70, 40, 40);
      
      window.setColor(color.YELLOW);
      window.fillOval(80, 80, 50, 50);
      
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}