import java.applet.Applet;
import java.awt.*;

public class FourthProgram extends Applet
{
	@Override
	public void init() 
	{
		setSize(800, 700);
	   Color c=new Color(111, 111, 255);
	   setBackground(c);
	   
	   Canvas cs=new Canvas();
	   cs.setSize(300, 200);
	   cs.setBackground(Color.red);;
	   add(cs);
	   
	   Scrollbar bar=new Scrollbar(Scrollbar.HORIZONTAL);
	   add(bar);
	}

}
