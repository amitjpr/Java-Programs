package swings;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
public class DemoOfBorder_Panel extends JPanel 
{
	JTextField t1;
	JPasswordField p1;
	JLabel l1,l2;
	JButton b1,b2;
	
	public DemoOfBorder_Panel(Border b)
	{
	  
	  setLayout(new GridLayout(3,2));
	  l1=new JLabel("Enter Username");
	  l2=new JLabel("Enter Password");
	  t1=new JTextField(10);
	  p1=new JPasswordField(10);
	  b1=new JButton("SAVE");
	  b2=new JButton("RESET");
	  add(l1);add(t1);add(l2);add(p1);add(b1);add(b2);
	  
	  setBorder(b);
	
	  
	  
	  
	  
	  
	}
	
}









