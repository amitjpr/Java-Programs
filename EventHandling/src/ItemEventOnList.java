import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ItemEventOnList extends Applet implements ItemListener
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
		l.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
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
















