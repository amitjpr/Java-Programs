import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoOfMouseListener1 extends Frame  
{
    public DemoOfMouseListener1()
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
     addMouseListener(new  MouseAdapter()
     {
	   public void mouseReleased(MouseEvent me)
	   {
		   /*if(me.getButton()==MouseEvent.BUTTON3)
		   {
			   System.out.println("Right click");
		   }
		   if(me.getButton()==2)
		   {
			   System.out.println("center click");
		   }
		   if(me.getButton()==1)
		   {
			   System.out.println("left click");
		   }*/
		   

		   if(me.getModifiers()==4)
		   {
			   System.out.println("Right click");
		   }
		   if(me.getModifiers()==8)
		   {
			   System.out.println("center click");
		   }
		   if(me.getModifiers()==16)
		   {
			   System.out.println("left click");
		   }
	   }
     
     });//mouse registration with frame
    }
    public static void main(String[] args) 
    {
		new DemoOfMouseListener1().setVisible(true);
	}
	
}
