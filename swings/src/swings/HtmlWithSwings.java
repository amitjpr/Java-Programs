package swings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HtmlWithSwings extends JFrame
{

	public HtmlWithSwings(String title)
	{
		MyFrameProperty.setProperty(this,"Demo of frames",false,900,700,new FlowLayout(),DISPOSE_ON_CLOSE);
       JLabel obj=new JLabel("<html><font color='blue'  size='30'><i>Road ahead technologies</font></html>");
       add(obj);
       
JButton b=new JButton("<html><body bgcolor='yellow'><h1>change color</h1></body></html>");
       add(b);
       
       b.addActionListener(new ActionListener() 
       {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
		  Color c=JColorChooser.showDialog(HtmlWithSwings.this, "Choose any color", Color.white);
		  getContentPane().setBackground(c);	
		}
	});
       
		
	}
	public static void main(String[] args) 
	{
     HtmlWithSwings obj=new HtmlWithSwings("Demo of html in frames");
     obj.setVisible(true);

	}

}
