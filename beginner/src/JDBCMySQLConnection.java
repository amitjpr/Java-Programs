/**
 * 
 */


/**
 * @author Ayush
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCMySQLConnection {
	
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String DATABASE_NAME="student";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	public static final String PORT="3306";
	public static final String IPADDRESS="127.0.0.1:";
	public static final String CONNECTING_DRIVERSTRING="jdbc:mysql:";
  
	public JDBCMySQLConnection() {
		try 
		{//load the driver
		Class.forName(DRIVER_CLASS);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("ERROR:JDBCMySQLConnection-constructor "+e.getMessage());
		}
	}
	
	private Connection createConnection() {
		Connection con=null ;
		String url=CONNECTING_DRIVERSTRING+"//"+IPADDRESS+PORT+"/"+DATABASE_NAME+","+USERNAME+","+PASSWORD ;
		System.out.println(url);
		try
		{
			 con=DriverManager.getConnection(url);	
		}
		catch(SQLException e)
		{
			System.out.println("ERROR:createConnection-method "+e.getMessage());
		}
		return con;
		
	}
	
	public static Connection getConnection() {
		return new JDBCMySQLConnection().createConnection();
		
	}
	

}
