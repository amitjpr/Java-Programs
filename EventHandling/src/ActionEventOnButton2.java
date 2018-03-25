import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ActionEventOnButton2 extends Applet 
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
	  b1.addActionListener(new ActionListener() 
	  {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			setBackground(Color.red);
		}
	});
	  b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			setBackground(Color.green);
		}
	});
	  b3.addActionListener(new ActionListener() 
	  {	
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				setBackground(Color.blue);
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setBackground(Color.white);
			}
		});
  }
     
}
