import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ItemEventOnChoice1 extends Applet implements ActionListener
{
	Choice choice;
	Button b;
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
		//choice.addItemListener(this);
		
		b=new Button("CLICK");add(b);
		b.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
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
















