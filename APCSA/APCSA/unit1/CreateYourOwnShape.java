package unit1;

import java.awt.Color;

import javax.swing.JFrame;

public class CreateYourOwnShape extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public CreateYourOwnShape()
	{
		super("CreateYourOwnShape");
		
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ShapePanel());
		
		//getContentPane().add(new BigHouse());		
				
		//getContentPane().add(new Robot()); 
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		CreateYourOwnShape run = new CreateYourOwnShape();
	}
}