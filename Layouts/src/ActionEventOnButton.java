import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventOnButton extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	@Override
	public void init()
	{
	   setSize(500,200);
	   b1=new Button("RED");
	   b2=new Button("GREEN");
	   b3=new Button("BLUE");
	   b4=new Button("WHITE");
	   add(b1);
	   add(b2);
	   add(b3);
	   add(b4);
	   
	   //registration steps
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		/*Button b=(Button)ae.getSource();
		if(b==b1)
			setBackground(Color.red);
		
		if(b==b2)
			setBackground(Color.green);
		*/
		
		if(ae.getSource()==b1)
			setBackground(Color.red);
		if(ae.getSource()==b2)
			setBackground(Color.green);
		if(ae.getSource()==b3)
			setBackground(Color.blue);
		if(ae.getSource()==b4)
			setBackground(Color.white);
		
	}
	
}
