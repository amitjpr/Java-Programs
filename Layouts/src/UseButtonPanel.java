import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class UseButtonPanel extends Applet 
{
	ButtonPanel p1,p2,p3;
   public void init()
   {
	   setSize(500, 300);
	   setLayout(new GridLayout(3, 1));
	   p1=new ButtonPanel(new FlowLayout());
	   p2=new ButtonPanel(new GridLayout(2, 2));
	   p3=new ButtonPanel(new BorderLayout());
	   add(p1);add(p2);add(p3);
   }
}
