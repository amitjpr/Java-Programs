import java.awt.*;
import java.awt.event.*;
public class FrameProperty 
{
   public static void set(Frame frm,String title,int w,int h,boolean resizable,LayoutManager layout)
   {
	   frm.setTitle(title);
	   frm.setSize(w, h);
	   frm.setLayout(layout);
	   frm.setResizable(resizable);
	  
	  
   }
}
