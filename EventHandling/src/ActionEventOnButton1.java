import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ActionEventOnButton1 extends Applet implements ActionListener
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
         String str=ae.getActionCommand();//to fetch the label
         System.out.println(str+" clicked!!");
         if(str.equalsIgnoreCase("red"))
        	 setBackground(Color.red);
         
         if(str.equalsIgnoreCase("green"))
        	 setBackground(Color.green);
         
         
         if(str.equalsIgnoreCase("blue"))
        	 setBackground(Color.blue);
         
         
         if(str.equalsIgnoreCase("white"))
        	 setBackground(Color.white);
    	}
}
