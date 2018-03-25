import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class FirstProgram extends Applet
{
	@Override
	public void init() 
	{
		setSize(600, 400);
		setBackground(Color.CYAN);	
		setForeground(Color.red);
		Font f=new Font("Calibri", Font.BOLD | Font.ITALIC, 30);
		setFont(f);
	}
     @Override
    public void paint(Graphics g) 
     {
      g.drawString("Demo of applets", 30, 100);
      
      g.setColor(Color.yellow);
      g.drawString("Road Ahead Tech.", 30, 140);
    	 
     }	
}
