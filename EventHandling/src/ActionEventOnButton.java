import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ActionEventOnButton extends Applet implements ActionListener
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
	  b1.addActionListener(this);//registration step
	  //source.registrationMethod(listener);
	  b2.addActionListener(this);//registration step
	  b3.addActionListener(this);//registration step
	  b4.addActionListener(this);//registration step
  }
     @Override
    	public void actionPerformed(ActionEvent ae)
        {
         Button b=(Button)ae.getSource();
         if(b==b1)
        	 setBackground(Color.red);
         
         if(ae.getSource()==b2)
        	 setBackground(Color.green);
         
         
         if(ae.getSource()==b3)
        	 setBackground(Color.blue);
         
         
         if(ae.getSource()==b4)
        	 setBackground(Color.white);
    	}
}
