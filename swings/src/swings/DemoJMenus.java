package swings;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class DemoJMenus extends JFrame 
{
	JMenuBar bar;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	JCheckBoxMenuItem i5;
	JRadioButtonMenuItem i6;
	public DemoJMenus()
	{
		setSize(600,300);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bar=new JMenuBar();
		setJMenuBar(bar);;
		
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		bar.add(m1);
		bar.add(m2);
		
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		i3=new JMenuItem("Item3");
		m1.add(i1);
		m1.addSeparator();
		m1.add(i2);
		m1.addSeparator();
		m1.add(i3);
		
		i4=new JMenuItem("Item4");
		i5=new JCheckBoxMenuItem("Item5");
		i6=new JRadioButtonMenuItem("Item6");
		m2.add(i4);
		m2.addSeparator();
		m2.add(i5);
		m2.addSeparator();
		m2.add(i6);
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DemoJMenus obj=new DemoJMenus();
        obj.setVisible(true);
	}

}
