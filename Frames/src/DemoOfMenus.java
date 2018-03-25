import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoOfMenus extends Frame 
{
	MenuBar bar;
	Menu menu1,menu2;
	MenuItem i1,i2,i3,i4,i5,i6;
	 public DemoOfMenus(String title)
	 {
		FrameProperty.set(this, title, 800, 500, false, new FlowLayout());
		setLocationRelativeTo(this);
		
		bar=new MenuBar();
		
		
		
		menu1=new Menu("File");
		menu2=new Menu("Edit");
		bar.add(menu1);
		bar.add(menu2);
		
		i1=new MenuItem("New");
		i2=new MenuItem("Open");
		i3=new MenuItem("Save");
		
		
		
		i4=new MenuItem("Cut");
		i5=new MenuItem("Copy");
		i6=new MenuItem("Paste");
		
		
		
		menu1.add(i1);
		menu1.addSeparator();
		menu1.add(i2);
		menu1.addSeparator();
		menu1.add(i3);
		
		
		menu2.add(i4);
		menu2.addSeparator();
		menu2.add(i5);
		menu2.addSeparator();
		menu2.add(i6);
		bar.add(menu1);
		bar.add(menu2);
		setMenuBar(bar);
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				ExitDialog obj=new ExitDialog(DemoOfMenus.this);
				obj.setVisible(true);
			}
		});
	 
	 }

	public static void main(String[] args) 
	{
	 new DemoOfMenus("Demo of menus").setVisible(true);

	}

}
