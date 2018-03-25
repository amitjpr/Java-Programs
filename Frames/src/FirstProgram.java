
import java.awt.*;
import java.awt.event.*;;

public class FirstProgram extends Frame implements ActionListener
{
	Button b1,b2,b3;
	public FirstProgram()
	{
		
	   FrameProperty.set(this, "First Program",500, 400, false, new FlowLayout());	
	  setLocationRelativeTo(this);
	   b1=new Button("NEXT");
	   b2=new Button("QUIT");
	   b3=new Button("HIDE");
	   add(b1);add(b2);add(b3);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   
	   
	   addWindowListener(new WindowAdapter()
	   {
		   public void windowClosing(WindowEvent we)
		   {
			   new ExitDialog(FirstProgram.this).setVisible(true);
		   }
	  });
	  
	   
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	      if(arg0.getSource()==b1)
	      {
		    SecondProgram obj=new SecondProgram("2nd Program",this);
		    obj.setVisible(true);
		   dispose();
	    
	      }
	      if(arg0.getSource()==b2)
	      {
	    	 new ExitDialog(FirstProgram.this).setVisible(true);
	      }
	      if(arg0.getSource()==b3)
	      {
	    	  setVisible(false);
	      }
	}
	public static void main(String[] args) {
		FirstProgram obj=new FirstProgram();
		obj.setVisible(true);
		
	}
	

}
