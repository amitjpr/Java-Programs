import java.awt.*;
import java.awt.event.*;

public class ExitDialog extends Dialog 
{
	 public ExitDialog(Frame frm)
	 {
		 super(frm);
		 setTitle("Confirm Exit");
		 setSize(400, 100);
		 setLocationRelativeTo(this);
		 setLayout(new FlowLayout());
		 
		 addWindowListener(new WindowAdapter() 
		 {
			 public void windowClosing(WindowEvent w)
			 {
			 dispose();
			 }
		});
		 
		Label l=new Label("Exit??");
		Button b1=new Button("YES");
		Button b2=new Button("NO");
		
		add(l);
		add(b1);
		add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		 b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		 
		 
	 }

}
