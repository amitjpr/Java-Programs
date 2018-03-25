import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class DrawingShapes extends Applet
{
	@Override
	public void init() 
	{
		setSize(800,800);
	}
		@Override
		public void paint(Graphics g) 
		{
	      /* g.drawLine(20, 20, 20, 120);	
	       g.setColor(Color.green);
	       g.drawRect(30, 20, 100, 100);
	       g.setColor(Color.blue);
	       g.fillRect(140, 20, 100, 100);
	       g.drawRoundRect(250, 20, 200, 200, 360, 60);
	       g.fillRoundRect(460, 200, 250, 250, 60, 60);
	       g.drawOval(30, 320, 300, 100);
	       g.fillOval(400, 500, 200, 200); */
	       
	       g.fillArc(200, 300, 200, 200, 0,180);
	       
	       
	       
	       int x[]={200,250,300,300,200};
	       int y[]={200,150,200,250,250};
	       g.drawPolygon(x, y, 5); 
	       
	       
	       
	       
	      
	       
	       
	       
	       
	       
	       
	       
		}
}
