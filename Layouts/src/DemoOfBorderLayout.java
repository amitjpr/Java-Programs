import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;

public class DemoOfBorderLayout extends Applet
{
	Button b1,b2,b3,b4;
	TextArea ta;
	@Override
	public void init() 
	{
	    setSize(800,300);

	   // setLayout(new BorderLayout());
		b1=new Button("Button1");
		b2=new Button("Button2");
		b3=new Button("Button3");
		b4=new Button("Button4");
		ta=new TextArea(5, 20);
		ta.setBackground(Color.yellow);
		add("North",b1);
		add(BorderLayout.EAST,b2);
		add(BorderLayout.SOUTH,b3);
		add(BorderLayout.WEST,b4);
		add(BorderLayout.CENTER,ta);
	
	}
}
