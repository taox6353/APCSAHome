package unit15;

import java.awt.Color;
import java.awt.Graphics;

class InvisibleBall extends Ball
{
	private boolean invisible;
	private Color orig;
   //constructors
   public InvisibleBall()
   {
		super();
		invisible = false;
   }

   public InvisibleBall(int x, int y)
   {
	   super(x,y);
	   invisible = false;

   }
   public InvisibleBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
		invisible = false;

   }

   public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);
		invisible = false;

   }
   
   public boolean isInvisible() {
	return invisible;
   }

   public void setInvisible(boolean invisible) {
	   this.invisible = invisible;
   }
   public double randomNum()
   {
   		double num = Math.random()*1000;
 		return num;
   }

   public void moveAndDraw(Graphics window)
   {
	 //draw a white ball at old ball location
	   window.setColor(Color.WHITE);
	   window.fillOval(getX(),getY(),getWidth(),getHeight());
	   
      setX(getX()+getXSpeed());
		//setY
      setY(getY()+getYSpeed());
		//draw the ball at its new location
      
      if(randomNum()<950){//pseudorandom element
    	  window.setColor(Color.WHITE);
    	  window.fillOval(getX(),getY(),getWidth(),getHeight());
      }
      else{
    	  window.setColor(getColor());
      window.fillOval(getX(),getY(),getWidth(),getHeight());
      }
   
    }
   
   
   
   
   
   //FAILED CODE
//public void goInvisible(Graphics window)
//   {
//		setInvisible(true);
//	 //draw a white ball at old ball location
//	   window.setColor(Color.WHITE);
//	   orig = super.getColor();
//	   super.setColor(Color.WHITE);
//	   window.fillOval(getX(),getY(),getWidth(),getHeight());
//	   
//      setX(getX()+getXSpeed());
//		//setY
//      setY(getY()+getYSpeed());
//   }
//   public void backVisible(Graphics window){
//	   setInvisible(false);
//	 //draw a white ball at old ball location
//	   window.setColor(Color.WHITE);
//	   window.fillOval(getX(),getY(),getWidth(),getHeight());
//      setX(getX()+getXSpeed());
//		//setY
//      setY(getY()+getYSpeed());
//		//draw the ball at its new location
//      super.setColor(orig);
//      window.setColor(getColor());
//	  window.fillOval(getX(),getY(),getWidth(),getHeight());
//   }
}