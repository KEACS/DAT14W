package achietecture.clbo.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect
{
	private static Connection conn = null;

	public static Connection getConn() throws SQLException
	{
		setConn();
		return conn;
	}

	private static void setConn() throws SQLException
	{
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
		
		

	}

	public static void connClose()
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				System.err.println(e);
			}
		}
	}

}
