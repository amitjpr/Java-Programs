import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoOfMouseListener extends Frame implements MouseListener 
{
    public DemoOfMouseListener()
    {
     FrameProperty.set(this, "Mouse listener", 500, 300, true, new FlowLayout());
     setLocationRelativeTo(this);
     
     
     addWindowListener(new WindowAdapter()
     {
    	   public void windowClosing(WindowEvent we)
    	   {
    		   dispose();
    	   }
	});
     
     
     addMouseListener(this);//mouse registration with frame
    }
    public static void main(String[] args) 
    {
		new DemoOfMouseListener().setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse clicked!");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	 System.out.println("Mouse Entered!");	
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited!");	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		System.out.println("Mouse Released!");
	}
}
