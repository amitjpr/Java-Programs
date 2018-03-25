package swings;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class DemoTabbedPane extends JPanel 
{
	JTabbedPane pane;
	public DemoTabbedPane()
	{
		pane=new JTabbedPane();
		pane.addTab("Tab1", new MyPanel1());
		pane.addTab("Tab2", new MyPanel2());
		pane.addTab("Tab3", new MyPanel3());
		pane.addTab("Tab4", new MyPanel4());
		add(pane);
	 
	}
}
