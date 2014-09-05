package com.dat14w;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySqlConnect
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet result = null;

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");

			preparedStatement = conn.prepareStatement("SELECT name, last_name from customers where name = 'Per'");
			result = preparedStatement.executeQuery();

			while (result.next())
			{
				//int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				//int phone = result.getInt("phone");
				//String email = result.getString("email");

				System.out.println(name + ", " + lastName );
				
				// put ArrayList

			}

			System.out.println("Connected to Database!");
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