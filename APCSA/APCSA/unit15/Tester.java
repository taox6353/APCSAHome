package unit15;

import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new BlockTestTwo());		
		
		//uncomment when you are ready to test the Ball
		getContentPane().add(new BallTestTwo());
		
//		PaddleTestTwo padTest = new PaddleTestTwo();
//		((Component)padTest).setFocusable(true);			
//		getContentPane().add(new PaddleTestTwo());//padTest);
		
//		getContentPane().add(new Pong());
		Pong pong = new Pong();
		((Component)pong).setFocusable(true);			
		getContentPane().add(pong);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}