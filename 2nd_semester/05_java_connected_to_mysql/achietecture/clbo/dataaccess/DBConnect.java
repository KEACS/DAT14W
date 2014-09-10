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
		// try
		// {
		// MsSql jdbc:sqlserver://localhost:1433;DatabaseName=YourDBName;user=UserName;Password=YourPassword
		//conn = DriverManager.getConnection("jdbc:sqlserver://mssql1.unoeuro.com;DatabaseName=clbo_org_db;user=clbo_org;Password=julebasist");
		// MySql
		conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
		System.out.println("DB Connect - " + conn);
		// }
		// catch (SQLException e)
		// {
		// System.err.println(e);
		// }

	}

	// public DBConnect()
	// {
	// try
	// {
	// conn =
	// DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
	// System.out.println("DB Connect");
	// }
	// catch (Exception e)
	// {
	// System.err.println(e);
	// }
	// }
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
