package swings;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
public class FirstProgram extends JApplet 
{
	JTextField t1;
	JPasswordField p1;
	JLabel l1,l2;
	JButton b1,b2;
	@Override
	public void init() 
	{
	  setSize(500, 100);
	  setLayout(new FlowLayout());
	  l1=new JLabel("Enter Username");
	  l2=new JLabel("Enter Password");
	  t1=new JTextField(10);
	  p1=new JPasswordField(10);
	  b1=new JButton("SAVE");
	  b2=new JButton("RESET");
	  add(l1);add(t1);add(l2);add(p1);add(b1);add(b2);
	  
	  JToggleButton obj=new JToggleButton("RED");
	  add(obj);
	  obj.addActionListener(new ActionListener()
	  {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			boolean b=obj.isSelected();
			System.out.println(b);
		   if(b)
		   {
			   getContentPane().setBackground(Color.red);
			   obj.setText("GREEN");
		   }
		   else
		   {
			   getContentPane().setBackground(Color.green);
			   obj.setText("RED");			   
		   }
			
		}
	});
	  
	  
	  
	  
	  
	}
	
}









