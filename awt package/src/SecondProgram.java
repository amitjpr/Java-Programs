import java.applet.Applet;
import java.awt.*;

import javax.swing.JRadioButton;
public class SecondProgram extends Applet 
{
	TextArea ta;
	Checkbox c1,c2,c3,c4,c5,c6;
	@Override
	public void init() 
	{
	  setSize(700,400);
	  ta=new TextArea(5, 40);
	  add(ta);
	  
	  c1=new Checkbox("C", false);
	  c2=new Checkbox("CPP", true);
	  c3=new Checkbox("C#", true);
	  add(c1);add(c2);add(c3);
	  
	  CheckboxGroup obj=new CheckboxGroup();
	  c4=new Checkbox("javaSE", true, obj);
	  c5=new Checkbox("javaEE", true, obj);
	  c6=new Checkbox("javaME", true, obj);
	  add(c4);
	  add(c5);
	  add(c6);
	  
	  
	 
	  
 
	  
	}
}
