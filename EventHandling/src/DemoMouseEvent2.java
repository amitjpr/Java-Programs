import java.applet.Applet;
import java.awt.event.*;
public class DemoMouseEvent2 extends Applet implements MouseListener
{
	public void init()
	{
		setSize(500,300);
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked!");	
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse Entered!");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse Exited!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse Pressed!");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse released!");
	}
	
}
















