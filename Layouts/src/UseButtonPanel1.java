import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class UseButtonPanel1 extends Applet 
{
	ButtonPanel p1,p2,p3,p4;
   public void init()
   {
	   setSize(600, 400);
	   setLayout(new BorderLayout());
	   p1=new ButtonPanel(new GridLayout(1, 4));
	   p2=new ButtonPanel(new GridLayout(1, 4));
	   p3=new ButtonPanel(new GridLayout(4, 1));
	   p4=new ButtonPanel(new GridLayout(4, 1));
	   add(BorderLayout.NORTH,p1);
	   add(BorderLayout.SOUTH,p2);
	   add(BorderLayout.EAST,p3);
	   add(BorderLayout.WEST,p4);
	   
	   
   }
}
