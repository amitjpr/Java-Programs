import java.applet.Applet;
import java.awt.*;
public class FirstProgram extends Applet 
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	@Override
	public void init() 
	{
	  setSize(600,200);
	  l1=new Label("Enter username");
	  l2=new Label("Enter Password");
	  t1=new TextField(10);
	  t1.setBackground(Color.yellow);
	  t2=new TextField(10);
	  t2.setEchoChar('*');
	  t2.setBackground(Color.cyan); 
	  b1=new Button("SAVE");
	  b2=new Button("RESET");
	  add(l1);
	  add(t1);
	  add(l2);
	  add(t2);
	  add(b1);
	  add(b2);
	}
}
