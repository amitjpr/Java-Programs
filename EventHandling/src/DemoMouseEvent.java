import java.applet.Applet;
import java.awt.event.*;
public class DemoMouseEvent extends Applet implements MouseListener
{
	public void init()
	{
		setSize(500,300);
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		///System.out.println("mouse clicked!");	
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		//System.out.println("mouse Entered!");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		//System.out.println("mouse Exited!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		//System.out.println("mouse Pressed!");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		
		//System.out.println("mouse released!");
		/*
		if(arg0.getButton()==MouseEvent.BUTTON3)
		{
		  System.out.println("right button clicked!!!!!!!!!!!!!!!");
		}
		if(arg0.getButton()==MouseEvent.BUTTON1)
		{
			System.out.println("LEFT button clicked!!!!!!!!!!!!!!!");
		}
		if(arg0.getButton()==MouseEvent.BUTTON2)
		{
			System.out.println("wheel clicked!!!!!!!!!!!!!!!");
		}	*/
		
		if(arg0.getModifiers()==4)
		{
			System.out.println("right");
		}
		if(arg0.getModifiers()==8)
		{
			System.out.println("wheel");
		}
		if(arg0.getModifiers()==16)
		{
			System.out.println("left");
		}
	
	}
	
}
















