import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class DemoOfFocusEvent extends Applet 
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
	  b1.addFocusListener(new FocusAdapter()
	  {
		 public void focusGained(FocusEvent fe)
		 {
			 setBackground(Color.red);
		 }
	  });
	  b2.addFocusListener(new FocusAdapter()
	  {
		 public void focusGained(FocusEvent fe)
		 {
			 setBackground(Color.green);
		 }
	  });
	  b3.addFocusListener(new FocusAdapter()
	  {
		 public void focusGained(FocusEvent fe)
		 {
			 setBackground(Color.blue);
		 }
	  });
	  b4.addFocusListener(new FocusAdapter()
	  {
		 public void focusGained(FocusEvent fe)
		 {
			 setBackground(Color.white);
		 }
	  });
	  
  }
		
  
}     
