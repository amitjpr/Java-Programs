package swings;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
public class MyPanel4 extends JPanel 
{
	JTable table;
	
	public MyPanel4()
	{
	  
	String header[]={"Name","Course","Timing"};
	String names[][]={{"Abhishek","java","11.30"},{"Abhishek","java","11.30"},{"Abhishek","java","11.30"},{"Abhishek","java","11.30"}};
	  table=new JTable(names, header);
	  JScrollPane pane=new JScrollPane(table);
	  add(pane);
	  
	  
	  
	  
	  
	}
	
}









