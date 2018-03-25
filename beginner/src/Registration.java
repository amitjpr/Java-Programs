import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Registration extends JFrame implements ActionListener 
{  JLabel lblsname,lblfname,lblmname,lbldob,lblgen,lbladd,lblcity,lblstat,lblpin,lblmob ,lblerr ; 
   JTextField txtname,txtfname,txtmname,txtdob,txtcity,txtadd,txtstat,txtpin,txtmob ;
   JRadioButton rdf,rdm ;
   ButtonGroup grp;
   JButton submit,retn; 
   String gen="M";

	public Registration(String title) 
	{
	  super(title);
	  setSize(600,600);
	  setLayout(null);
	  
	  setLocationRelativeTo(this);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  lblsname=new JLabel("Students name*");        lblsname.setBounds(100 , 50, 100, 20);
	  lblfname=new JLabel("Fathers name*");         lblfname.setBounds(100, 90, 100, 20);
	  lblmname=new JLabel("Mothers name");          lblmname.setBounds(100, 130, 100, 20);lblerr=new JLabel("");
	  lbldob=new JLabel("DOB*");                    lbldob.setBounds(100, 170, 100, 20);lblerr.setBounds(150, 20, 300, 20);add(lblerr);
	  lblgen=new JLabel("Gender");                  lblgen.setBounds(100, 210, 100, 20);
	  lbladd=new JLabel("Address");                 lbladd.setBounds(100, 250, 100, 20);
	  lblcity=new JLabel("City*");                  lblcity.setBounds(100, 290, 100, 20);
	  lblstat=new JLabel("State");                  lblstat.setBounds(100, 330, 100, 20);
	  lblpin=new JLabel("Pincode");                 lblpin.setBounds(100, 370, 100, 20);
	  lblmob=new JLabel("mobile no*");              lblmob.setBounds(100, 410, 100, 20);
	  
	  add(lblsname);  add(lblfname);  add(lblmname);  add(lbldob);  add(lblgen);  add(lbladd);  add(lblcity);  add(lblstat);  add(lblpin);
	  add(lblmob);
	  txtname=new JTextField();        txtname.setBounds(200 , 50, 300, 20);add(txtname);
	  txtfname=new JTextField();       txtfname.setBounds(200 , 90, 300, 20);add(txtfname);
	  txtmname=new JTextField();       txtmname.setBounds(200 , 130, 300, 20);add(txtmname);
	  txtdob=new JTextField();         txtdob.setBounds(200 , 170, 300, 20);add(txtdob);
	  txtdob.setText("yyyy-mm-dd");    txtdob.addActionListener(this);
	  
	  txtadd=new JTextField();         txtadd.setBounds(200 , 250, 300, 20);add(txtadd);
	  txtcity=new JTextField();        txtcity.setBounds(200 , 290, 300, 20);add(txtcity);
	  txtstat=new JTextField();        txtstat.setBounds(200 , 330, 300, 20);add(txtstat);
	  txtpin=new JTextField("");         txtpin.setBounds(200 , 370, 300, 20);add(txtpin);
	  txtmob=new JTextField();         txtmob.setBounds(200 , 410, 300, 20);add(txtmob);
	  
	  rdm=new JRadioButton("Male");    rdm.setBounds(200 , 210, 150, 20);add(rdm);
	  rdf=new JRadioButton("FeMale");  rdf.setBounds(350 , 210, 150, 20);add(rdf);
	  rdm.setSelected(true);
	  
	  ButtonGroup buttonGroup = new ButtonGroup();
	  buttonGroup.add(rdf);
	  buttonGroup.add(rdm);
	  
	  rdf.addActionListener(this);
	  rdm.addActionListener(this);
	  
	  submit=new JButton("Submit");   submit.setBounds(150 , 460, 100, 20);add(submit);
	  retn=new JButton("Return");     retn.setBounds(300 , 460, 100, 20);add(retn);
	  
		submit.addActionListener(this);
		retn.addActionListener(this);
		 
    }
	
	private boolean validateData() {
		if(txtname.getText()==null || txtname.getText().length()<1) {
			lblerr.setText("***student name REquired");
			return false;
		} 
		else if(txtfname.getText()==null || txtfname.getText().length()<1)
		{
			lblerr.setText("***father name REquired");
			return false;
		}
		else if(txtmname.getText()==null)
		{
			return false;
		}
		else if(txtdob.getText()==null  )
		{
			lblerr.setText("***dob REquired");
			return false;
		}
		else if(isValidDate(txtdob.getText())== false)
		{
			lblerr.setText("***dob in wrong format");
			return false;
		}
		else if(txtadd.getText()==null)
		{
			return false;
		}
		else if(txtcity.getText()==null || txtcity.getText().length()<1)
		{
			lblerr.setText("***city REquired");
			return false;
		}
		else if(txtstat.getText()==null)
		{
			return false;
		}
		else if(txtpin.getText()==null || txtpin.getText().length()!=6)
		{
			lblerr.setText("pincode REquired or wrong");
			return false;
		}
		else if(txtmob.getText()==null || txtmob.getText().length()!=10)
		{
			lblerr.setText("mobile no REquired or wrong");
			return false;
		}
		
		return true;
	}
	
	public static boolean isValidDate(String inDate) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(inDate.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }

	@Override
	public void actionPerformed(ActionEvent ae) 
	{   
		if(ae.getSource()==retn)
		{
			first_page obj=new first_page("first_page");
			obj.setVisible(true);
			this.setVisible(false);
		}
		if(ae.getSource()==rdm)
		{
			gen="M";
		}
		if(ae.getSource()==rdf)
			gen="F";
		if(ae.getSource()==txtdob)
		{
			if(txtdob.getText().length()>0)
				txtdob.setText("");
		}
		if(ae.getSource()==submit)
		{ 
			if(validateData()==true) {
			
			Connection cn=DBInfo.getConn();
			
			//query
			String str="insert into beginner(student_name,fathers_name,mothers_name,DOB,Gender, address,city,state ,pincode,mobile_no) values(?,?,?,?,?,?,?,?,?,?)";
			
			String stunam=txtname.getText();
			String fatnam=txtfname.getText();
			String mothnam=txtmname.getText();
			String dob=txtdob.getText();
			String address=txtadd.getText();
			String city=txtcity.getText();
			String state=txtstat.getText();
			String pin=txtpin.getText();
			String mob=txtmob.getText();
			
			
			
			PreparedStatement ps = null;
			try {
				ps = cn.prepareStatement(str);
			
			ps.setString(1, stunam);
			ps.setString(2, fatnam);
			ps.setString(3, mothnam);
			ps.setString(4, dob);
			ps.setString(5, gen);
			ps.setString(6, address);
			ps.setString(7, city);
			ps.setString(8, state);
			ps.setString(9, pin);
			ps.setString(10, mob);
			int i=ps.executeUpdate();
			System.out.println(i+" record inserted!!");
			if(i==1)
		      {
		    	  JOptionPane.showMessageDialog(getParent(), "Registration done", "Success", JOptionPane.INFORMATION_MESSAGE);
		          
		      }
		      if(i==0)
		      {
		    	  JOptionPane.showMessageDialog(getParent(), "Registration failed!!", "Error", JOptionPane.ERROR_MESSAGE);
		      }
			
			cn.close();
			ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			
		}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Registration r=new Registration("Registration page");
		r.setVisible(true);
	}

}
