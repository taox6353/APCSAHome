package unit1;

import javax.swing.JFrame;

public class Lab01d extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Lab01d()
	{
		super("Lab01d");
		
		setSize(WIDTH,HEIGHT);
				
		getContentPane().add(new Robot()); 
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Lab01d run = new Lab01d();
		
	}
}