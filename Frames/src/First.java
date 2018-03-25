import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends Frame 
{
  public First() 
  {
	  
	super("First");
	setSize(getToolkit().getScreenSize());
	setLayout(new FlowLayout());
	
	  
	  setBackground(Color.yellow);
	  Button b=new Button("NEXT");
	  add(b);
	  b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Second s=new Second("Second  Frame",First.this);
			s.setVisible(true);
			dispose();
			
		}
	});
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new First().setVisible(true);
	}

}
