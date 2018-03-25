package swings;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class SecondProgram extends JFrame 
{
	JTextArea ta;
	JCheckBox c1,c2,c3;
	JRadioButton r1,r2,r3;
	
	 public SecondProgram() 
	 {
		 setSize(600,200);
		 setLocationRelativeTo(this);
		 setLayout(new FlowLayout());
		 
		 ta=new JTextArea(5, 20);
		 JScrollPane pane=new JScrollPane(ta);
		 add(pane);
		 
		 c1=new JCheckBox("JAVASE");
		 c2=new JCheckBox("JAVAEE");
		 c3=new JCheckBox("JAVAME");
		 add(c1);add(c2);add(c3);
		 
		 r1=new JRadioButton("JAVASE");
		 r2=new JRadioButton("JAVAEE");
		 r3=new JRadioButton("JAVAME");
		 ButtonGroup bg=new ButtonGroup();
		 bg.add(r1);
		 bg.add(r2);
		 bg.add(r3);
		 add(r1);add(r2);add(r3);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);//to close the frame
	}
	
	public static void main(String[] args) 
	{
	    SecondProgram obj=new SecondProgram();
	    obj.setVisible(true);
	}

}
