import java.applet.Applet;
import java.awt.Choice;
import java.awt.List;
public class ThirdProgram extends Applet 
{
	Choice c;
	List l;
	@Override
	public void init() 
	{
		setSize(500,300);
		c=new Choice();
		c.add("Item1       ");
		c.add("Item2");
		c.add("Item3");
		c.add("Item4");
		c.add("Item5");
		c.add("Item6");
		c.add("Item8");
		c.add("Item9");
		c.add("Item10");
		c.add("Item11");
		add(c);
		
		l=new List(8);
		l.add("item11");
		l.add("item12");
		l.add("item13");
		l.add("item14");
		l.add("item15");
		l.add("item16");
		l.add("item17");
		l.add("item18");
		l.add("item19");
		l.add("item10");
		l.add("item12");
		l.add("item13");
		add(l);
	
	}

}
