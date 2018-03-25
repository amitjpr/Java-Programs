import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class first_page extends JFrame implements ActionListener
{ 
	JButton b1,b2,b3;
	
	public first_page(String title)
	{
		super(title);
		setSize(400, 300);
		setLayout(null);

		setLocationRelativeTo(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1=new JButton("REGISTER");
		b1.setBounds(100, 50, 100, 20);
		b2=new JButton("EXIT");
		
		b3=new JButton("View All");
		b2.setBounds(100, 150, 100, 20);
		b3.setBounds(100, 100, 100, 20);
		add(b1);add(b3);add(b2);
		b1.addActionListener(this);
		   b2.addActionListener(this);b3.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
	    if(ae.getSource()==b2)
	    {
	    	System.exit(0);
	    } 
	    if(ae.getSource()==b1)
	    {
	    	Registration obj=new Registration("Register");
	    	this.setVisible(false);
	    	obj.setVisible(true);
	    }
	    if(ae.getSource()==b3)
	    {
	    	View_all obj=new View_all("View_all");
	    	this.setVisible(false);
	    	
	    	obj.setVisible(true);
	    }
	}
	public static void main(String[] args)
	{
	  first_page r=new first_page("First_page");
		r.setVisible(true);
	}

}
