package com.dat14w;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Insert
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");

			preparedStatement = conn.prepareStatement("INSERT INTO customers VALUES(default, ?, ?, ?, ?);");
			preparedStatement.setString(1, "Yoanna");
			preparedStatement.setString(2, "Dandarova");
			preparedStatement.setInt(3, 32323232);
			preparedStatement.setString(4, "joan@kea.dk");
			preparedStatement.executeUpdate();
			
			System.out.println("Database updated!");

		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			if (conn != null)
			{
				conn.close();
			}

		}

	}

}
