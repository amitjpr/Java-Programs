import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ItemEventOnRadio extends Applet implements ItemListener
{
	Checkbox c1,c2,c3,c4;
	public void init()
	{
		setSize(500,300);
		
		CheckboxGroup obj=new CheckboxGroup();
		c1=new Checkbox("RED", true, obj);
		c2=new Checkbox("GREEN", true, obj);
		c3=new Checkbox("BLUE", true, obj);
		c4=new Checkbox("WHITE", true, obj);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==c1)
			setBackground(Color.red);
		if(e.getSource()==c2)
			setBackground(Color.green);
		if(e.getSource()==c3)
			setBackground(Color.blue);
		if(e.getSource()==c4)
			setBackground(Color.white);
		
	}

}
















