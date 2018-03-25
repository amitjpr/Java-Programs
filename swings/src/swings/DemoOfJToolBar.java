package swings;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class DemoOfJToolBar extends JPanel 
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JToolBar bar;
	public DemoOfJToolBar()
	{
	 ImageIcon obj=new ImageIcon("home.png");
	 b1=new JButton(obj);
	 b1.setToolTipText("Home");
	 b2=new JButton(new ImageIcon("admin.png"));
	 b3=new JButton(new ImageIcon("account.png"));
	 b4=new JButton(new ImageIcon("fees.png"));
	 b5=new JButton(new ImageIcon("student.png"));
	 b6=new JButton(new ImageIcon("people.png"));
	 b7=new JButton(new ImageIcon("report.png"));
	 
	 bar=new JToolBar();
	 bar.setOrientation(JToolBar.VERTICAL);
	 bar.setEnabled(false);
	 bar.add(b1);
	 bar.add(b2);
	 bar.add(b3);
	 bar.add(b4);
	 bar.add(b5);
	 bar.add(b6);
	 bar.add(b7);
	 add(bar);
	 
	}
}
