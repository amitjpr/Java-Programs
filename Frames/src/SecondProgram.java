import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondProgram extends Frame 
{
	Button b1;
	public SecondProgram(String title,Frame frm)
	{
		
		FrameProperty.set(this, title,600, 300, false, new FlowLayout());
	 
		b1=new Button("BACK");
		add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				frm.setVisible(true);
				dispose();
			}
		});
	}
	

}
