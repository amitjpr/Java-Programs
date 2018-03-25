package swings;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class MyPanel3 extends JPanel
{
	JList list;
	JComboBox<String> cb;
	public MyPanel3() 
	{
	 setSize(500, 200);
	 
	
	 setLayout(new FlowLayout());
	 
	 String values[]={"Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1"};
	 list=new JList<>(values);
	 list.setVisibleRowCount(3);
	 JScrollPane pane=new JScrollPane(list);
	 add(pane);
	 
	 cb=new JComboBox<>(values);
	 add(cb);
	}
	

}
