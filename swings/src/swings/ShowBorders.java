package swings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

public class ShowBorders extends JFrame
{
	DemoOfBorder_Panel p1,p2,p3,p4,p5,p6,p7;
	public ShowBorders(String title)
	{
	  setSize(900,400);	
      setLocationRelativeTo(this);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(new FlowLayout());
      
  p1=new DemoOfBorder_Panel(BorderFactory.createBevelBorder(BevelBorder.RAISED));
  add(p1);
  
  p2=new DemoOfBorder_Panel(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
  add(p2);
  
  p3=new DemoOfBorder_Panel(BorderFactory.createDashedBorder(null));
  add(p3);
      
      p4=new DemoOfBorder_Panel(BorderFactory.createLineBorder(Color.blue, 5));
      add(p4);
      
      p5=new DemoOfBorder_Panel(BorderFactory.createTitledBorder("Login"));
      add(p5);
	}
	public static void main(String[] args) 
	{
     ShowBorders obj=new ShowBorders("Demo of html in frames");
     obj.setVisible(true);
    

	}

}
