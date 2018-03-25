import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class DemoOfFocusEvent2 extends Applet implements FocusListener
{
  Button b1,b2,b3,b4;
  public void init()
  {
	  setSize(800, 400);
	 
	  b1=new Button("RED");
	  b2=new Button("GREEN");
	  b3=new Button("BLUE");
	  b4=new Button("WHITE");
	  add(b1);
	  add(b2);
	  add(b3);
	  add(b4);
	  b1.addFocusListener(this);//registration step
	  b2.addFocusListener(this);//registration step
	  b3.addFocusListener(this);//registration step
	  b4.addFocusListener(this);//registration step
  }
		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub

			if(arg0.getSource()==b1)
			{
				setBackground(Color.red);
			}
			if(arg0.getSource()==b2)
			{
				setBackground(Color.green);
			}
			if(arg0.getSource()==b3)
			{
				setBackground(Color.blue);
			}
			if(arg0.getSource()==b4)
			{
				setBackground(Color.white);
			}
			
		}
		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			
		}
  
}     
