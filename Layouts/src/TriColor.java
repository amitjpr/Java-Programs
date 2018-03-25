import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;

public class TriColor extends Applet 
{
	ColorPanel c1,c2,c3;
      @Override
    public void init() 
      {
    	  setSize(400, 200);
    	  setLayout(new GridLayout(3, 1));
    	  c1=new ColorPanel(Color.orange);
    	  c2=new ColorPanel(Color.white);
    	  c3=new ColorPanel(Color.green);
    	  add(c1);
    	  add(c2);
    	  add(c3);
      }
}
