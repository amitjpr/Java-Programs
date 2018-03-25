import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoOfPopupMenu extends Frame  
{
	PopupMenu pop;
	MenuItem m1,m2,m3,m4,m5,m6;
    public DemoOfPopupMenu()
    {
     FrameProperty.set(this, "Mouse listener", 500, 300, true, new FlowLayout());
     setLocationRelativeTo(this);
     
     
     pop=new PopupMenu();
     m1=new MenuItem("Cut");
     m2=new MenuItem("Copy");
     m3=new MenuItem("Paste");
     m4=new MenuItem("Save");
     m5=new MenuItem("New");
     m6=new MenuItem("Open");
     pop.add(m1);
     pop.addSeparator();
     pop.add(m2);
     pop.addSeparator();
     pop.add(m3);
     pop.addSeparator();
     pop.add(m4);
     pop.addSeparator();
     pop.add(m5);
     pop.addSeparator();
     pop.add(m6);
     pop.addSeparator();
     add(pop);
     
     
     
     
     
     addWindowListener(new WindowAdapter()
     {
    	   public void windowClosing(WindowEvent we)
    	   {
    		   dispose();
    	   }
	});
     addMouseListener(new  MouseAdapter()
     {
	   public void mouseReleased(MouseEvent me)
	   {
		  if(me.getButton()==MouseEvent.BUTTON3)
		   {
		pop.show(DemoOfPopupMenu.this, me.getX(), me.getY());
		   }
	   }
     
     });//mouse registration with frame
    }
    public static void main(String[] args) 
    {
		new DemoOfPopupMenu().setVisible(true);
	}
	
}
