import java.applet.Applet;
import java.awt.*;

public class FirstProgram extends Applet
{
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
	@Override
	public void init() 
	{
		setSize(700-50, 200);
		setLayout(null);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(10);t1.setBackground(Color.yellow);
		t2=new TextField(10);t2.setBackground(Color.yellow);
		t2.setEchoChar('*');
		b1=new Button("SAVE");
		b2=new Button("QUIT");
		
		l1.setBounds(200, 50, 100, 20);//x,y,w,h
		t1.setBounds(200+110, 50, 150, 20);//x,y,w,h
		
		l2.setBounds(200, 80, 100, 20);//x,y,w,h
		t2.setBounds(200+110,80, 150, 20);//x,y,w,h
		
		
		b1.setBounds(200, 80+30, 100, 20);//x,y,w,h
		b2.setBounds(200+110,80+30, 150, 20);//x,y,w,h
		
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
	}
}
