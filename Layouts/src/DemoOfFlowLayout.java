import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
public class DemoOfFlowLayout extends Applet
{
	Button b1,b2,b3,b4;
	@Override
	public void init() 
	{
		// TODO Auto-generated method stub
	    setSize(800,300);
	    setLayout(new FlowLayout(FlowLayout.RIGHT));
		b1=new Button("Button1");
		b2=new Button("Button2");
		b3=new Button("Button3");
		b4=new Button("Button4");
		add(b1);add(b2);add(b3);add(b4);
		
		
	}

}
