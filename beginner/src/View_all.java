import java.awt.BorderLayout;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class View_all extends JFrame {
     
	private boolean status;

	public View_all(String title) {

		// Creating Window using JFrame
		JFrame frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(1600, 1200);

		// Adding Table View
		frame.add(getTablePanel());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private JPanel getTablePanel() {

		JPanel tableJPanel = new JPanel();
		
		tableJPanel.setLayout(new BorderLayout());
		
		// Column Header
		String[] columns = {  "Roll_no",

		"Student_name", "Father_name", "Mother_name",
				"Date_of_birth", "gender" , "Address" , "city" , "State" , " pincode", "mobile"};

		// Getting Data for Table from Database
		Object[][] data = getEmployeeDetails();

		// Creating JTable object passing data and header
		JTable employeeTable = new JTable(data, columns);
		
		
		tableJPanel.add(employeeTable.getTableHeader(), BorderLayout.NORTH);
		tableJPanel.add(employeeTable, BorderLayout.CENTER);
		
		return tableJPanel;
	}

	private Object[][] getEmployeeDetails() {

		Object[][] data = null;

		Connection cn=DBInfo.getConn();
		final String QUERY = "Select Roll_no ,student_name,fathers_name,mothers_name,DOB,Gender, address,city,state ,pincode,mobile_no from beginner";

		try {

			

			Statement statement = cn.createStatement();

			ResultSet rs = statement.executeQuery(QUERY);

			int rowCount = getRowCount(rs); // Row Count
			int columnCount = getColumnCount(rs); // Column Count

			data = new Object[rowCount][columnCount];

			// Starting from First Row for Iteration
			rs.beforeFirst();

			int i = 0;
			
			while (rs.next()) {

				int j = 0;

				data[i][j++] = rs.getString("Roll_no");
				data[i][j++] = rs.getString("student_name");
				data[i][j++] = rs.getString("fathers_name");
				data[i][j++] = rs.getString("mothers_name");
				data[i][j++] = rs.getString("DOB");
				data[i][j++] = rs.getString("gender");
				data[i][j++] = rs.getString("address");
				data[i][j++] = rs.getString("city");
				data[i][j++] = rs.getString("state");
				data[i][j++] = rs.getString("pincode");
				data[i][j++] = rs.getString("mobile_no");

				i++;
			}

			status = true;
			
			// Closing the Resources;
			statement.close();
			cn.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		return data;
	}

	// Method to get Row Count from ResultSet Object
	private int getRowCount(ResultSet rs) {

		try {
			
			if(rs != null) {
				
				rs.last();
				
				return rs.getRow(); 
			}
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return 0;
	}

	// Method to get Column Count from ResultSet Object
	private int getColumnCount(ResultSet rs) {

		try {

			if(rs != null)
				return rs.getMetaData().getColumnCount();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public String toString() {
		
		return (status) ? "Data Listed Successfully" : "Application Error Occured";
	}
	public static void main(String[] args) {
		String title = "Students Details Table";

		View_all employeeDetails = new View_all(title);

		System.out.println(employeeDetails);

	}

}
