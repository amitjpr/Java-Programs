package swings;


import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MyFrameProperty 
{
  public static void setProperty(JFrame frm,String title,
		     boolean resize,int w,int h,LayoutManager layout,int closeoperation)
  {
	  frm.setTitle(title);
	  frm.setResizable(resize);
	  frm.setSize(w, h);
	  frm.setLocationRelativeTo(frm);
	  frm.setLayout(layout);
	  frm.setDefaultCloseOperation(closeoperation);
      
  }
}
