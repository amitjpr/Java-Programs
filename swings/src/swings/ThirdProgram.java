package swings;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
public class ThirdProgram extends JFrame
{
	JList list;
	JComboBox<String> cb;
	public ThirdProgram() 
	{
	 setSize(500, 200);
	 setLocationRelativeTo(this);
	 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 setLayout(new FlowLayout());
	 
	 String values[]={"Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1"};
	 list=new JList<>(values);
	 list.setVisibleRowCount(3);
	 JScrollPane pane=new JScrollPane(list);
	 add(pane);
	 
	 cb=new JComboBox<>(values);
	 add(cb);
	}
	public static void main(String[] args) 
	{
		new ThirdProgram().setVisible(true);
	}

}
