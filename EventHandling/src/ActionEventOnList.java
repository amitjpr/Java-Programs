import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ActionEventOnList extends Applet implements ActionListener
{
	List l;
	public void init()
	{
		setSize(500,300);
		l=new List();
		l.add("RED");
		l.add("GREEN");
		l.add("BLUE");
		l.add("WHITE");
		add(l);
		l.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		  String str=l.getSelectedItem();
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
















