package swings;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class DemoOfJSplitPane extends JFrame 
{
	JSplitPane pane;
   public DemoOfJSplitPane() 
   {
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setSize(1000,600);
	setLocationRelativeTo(this);
	
	pane=new JSplitPane();
	pane.setEnabled(false);
	pane.setLeftComponent(new DemoOfJToolBar());
	pane.setRightComponent(new DemoTabbedPane());
	add(pane);
   }
	public static void main(String[] args) 
	{
	 new DemoOfJSplitPane().setVisible(true);

	}

}
