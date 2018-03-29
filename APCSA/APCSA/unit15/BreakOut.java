package unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle Paddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall left;
	private Wall right;
	private Wall top;
	private Wall bottom;
	private Block block1;
	private Block block2;
	private Block block3;
	
	public BreakOut()
	{
		//set up all variables related to the game
		ball = new Ball(100,200,25,25,Color.CYAN,2,2);
		Paddle = new Paddle(400,520,80,15,Color.RED,5);
		left = new Wall(0,0,10,600);
		right = new Wall(775,0,10,600);
		top = new Wall(0,0,800,10);
		bottom = new Wall(0,555,800,10);
		block1 = new Block(150,100,100,30,Color.MAGENTA);
		block2 = new Block(300,100,100,30,Color.MAGENTA);
		block3 = new Block(450,100,100,30,Color.MAGENTA);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		Paddle.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		block1.draw(graphToBack);
		block2.draw(graphToBack);
		block3.draw(graphToBack);
		
		graphToBack.setColor(Color.GREEN);


		//see if ball hits left wall or right wall
		if(!((ball.getX()>=left.getX()+left.getWidth())&&(ball.getX()<=right.getX()-right.getWidth())))
		{
			if(!(ball.getX()>=left.getX()+left.getWidth())){
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(!(ball.getX()<=right.getX()-right.getWidth())){
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideBottom(bottom) || ball.didCollideTop(top))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
			//nothing
		}
		if(keys[1] == true)
		{
			//move paddle left
			Paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			//nothing
		}
		if(keys[3] == true)
		{
			//move paddle right
			Paddle.moveRightAndDraw(graphToBack);
		}
		//see if the ball hits the paddle
		if(ball.didCollidePaddle(Paddle)){
			ball.setYSpeed(-ball.getYSpeed());
			}
		//see if the paddles need to be moved
		if(Paddle.didCollideLeft(left)||Paddle.didCollideRight(right)){
			if(Paddle.didCollideLeft(left))
				Paddle.moveRightAndDraw(graphToBack);
			if(Paddle.didCollideRight(right))
				Paddle.moveLeftAndDraw(graphToBack);
			}
		if(ball.didCollideBlock(block1)||ball.didCollideBlock(block2)||ball.didCollideBlock(block3)){
			if(ball.didCollideBlock(block1)){
				block1.remove(graphToBack);
				block1 = new Block(0,0,0,0,Color.GRAY);
				block1.draw(graphToBack);
				ball.setYSpeed(-ball.getYSpeed());
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(ball.didCollideBlock(block2)){
				block2.remove(graphToBack);
				block2 = new Block(0,0,0,0,Color.GRAY);
				block2.draw(graphToBack);
				ball.setYSpeed(-ball.getYSpeed());
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(ball.didCollideBlock(block3)){
				block3.remove(graphToBack);
				block3 = new Block(0,0,0,0,Color.GRAY);
				block3.draw(graphToBack);
				ball.setYSpeed(-ball.getYSpeed());
				ball.setXSpeed(-ball.getXSpeed());
			}
			}
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}