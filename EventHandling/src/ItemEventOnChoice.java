import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ItemEventOnChoice extends Applet implements ItemListener
{
	Choice choice;
	public void init()
	{
		setSize(500,300);
		choice=new Choice();
		choice.add("Select");
		choice.add("RED");
		choice.add("GREEN");
		choice.add("BLUE");
		choice.add("WHITE");
		add(choice);
		choice.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		  String str=choice.getSelectedItem();
		  if(str.equalsIgnoreCase("red"))
	        	 setBackground(Color.red);
	         
	         if(str.equalsIgnoreCase("green"))
	        	 setBackground(Color.green);
	         
	         
	         if(str.equalsIgnoreCase("blue"))
	        	 setBackground(Color.blue);
	         
	         
	         if(str.equalsIgnoreCase("white") || str.equalsIgnoreCase("select"))
	        	 setBackground(Color.white);
	}

}
















