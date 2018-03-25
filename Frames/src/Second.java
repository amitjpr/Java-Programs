import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Second extends Frame 
{

	public Second(String title,Frame frm)
	{
     FrameProperty.set(this, title, 400, 200, false, new FlowLayout());
     Button b=new Button("BACK");
     add(b);
     b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			frm.setVisible(true);
			dispose();
		}
	});
	}
}
