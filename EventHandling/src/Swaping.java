import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Swaping extends Applet implements ActionListener
{
	List l;
	List l1;
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
		
		l1=new List();
		add(l1);
		l1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
	   if(arg0.getSource()==l)
	   {
		String str=l.getSelectedItem();
		l.remove(str);
		l1.add(str);
	   }
	   if(arg0.getSource()==l1)
	   {
		   String str=l1.getSelectedItem();
			l1.remove(str);
			l.add(str);
	   }
	}

}
















