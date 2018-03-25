import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
public class DemoOfGridLayout extends Applet
{
	Button b1,b2,b3,b4;
	@Override
	public void init() 
	{
		
	    setSize(800,300);
	    
	    /*GridLayout obj=new GridLayout(6, 2);
	    setLayout(obj);*/
	    
	    setLayout(new GridLayout(2,2,10,10));
		b1=new Button("Button1");
		b2=new Button("Button2");
		b3=new Button("Button3");
		b4=new Button("Button4");
		add(b1);add(b2);add(b3);add(b4);
	}
}
