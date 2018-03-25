import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.LayoutManager;
import java.awt.Panel;
public class ButtonPanel extends Panel
{
	Button b1,b2,b3,b4;
	public ButtonPanel(LayoutManager obj)
	{
		setLayout(obj);
		b1=new Button("Button1");
		b2=new Button("Button2");
		b3=new Button("Button3");
		b4=new Button("Button4");
		add(BorderLayout.NORTH,b1);
		add(BorderLayout.WEST,b2);
		add(BorderLayout.EAST,b3);
		add(BorderLayout.SOUTH,b4);
	}
}
