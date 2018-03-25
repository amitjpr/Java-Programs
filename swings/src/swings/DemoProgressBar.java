package swings;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class DemoProgressBar extends JFrame
{
  JProgressBar bar;
  int i=0;
	public DemoProgressBar(String title)
	{
	  setSize(500,300);	
      setLocationRelativeTo(this);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(new BorderLayout());
       bar=new JProgressBar(0, 1000);
       bar.setStringPainted(true);
       bar.setForeground(Color.green);
       setUndecorated(true);
       
       bar.setValue(0);
       add(BorderLayout.SOUTH,bar);
	}
	void setValue()
	{
		while(i<=1000)
		{
			bar.setValue(i);
			i=i+10;
			try
			{
				Thread.sleep(40);
			}
			catch(Exception e)
			{
				
			}
		}
		dispose();
		HtmlWithSwings obj=new HtmlWithSwings("Demo");
		obj.setVisible(true);
	}
	public static void main(String[] args) 
	{
     DemoProgressBar obj=new DemoProgressBar("Demo of html in frames");
     obj.setVisible(true);
     obj.setValue();

	}

}
