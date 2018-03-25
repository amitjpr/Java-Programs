import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Swaping2 extends Applet implements ActionListener
{
	List l;
	List l1;
	Button b1,b2;
	public void init()
	{
		setSize(500,300);
		l=new List();
		l.add("RED");
		l.add("GREEN");
		l.add("BLUE");
		l.add("WHITE");
		add(l);
		l1=new List();
		b1=new Button(">");
		b2=new Button("<");
		add(b1);add(b2);add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
	   if(arg0.getSource()==b1)
	   {
		String str=l.getSelectedItem();
		if(str!=null)
		{
			l.remove(str);
			l1.add(str); 	
		}
		else
		{
		
		JOptionPane.showMessageDialog(this,"Select any value!","Error",JOptionPane.ERROR_MESSAGE);
		}
	   }
	   if(arg0.getSource()==b2)
	   {
		String str=l1.getSelectedItem();
		if(str!=null)
		{
			l1.remove(str);
			l.add(str); 	
		}
		else
		{
		JOptionPane.showMessageDialog(this, "Select any value!");
		}
	   }
	}

}
















