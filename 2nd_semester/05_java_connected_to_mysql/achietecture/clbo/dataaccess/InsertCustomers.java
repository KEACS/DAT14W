package achietecture.clbo.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import achietecture.clbo.application.datatypes.Customer;

public class InsertCustomers
{
	private Connection conn;
	private PreparedStatement prepareStatement = null;

	public void insert(Customer customer)
	{
		try
		{
			this.conn = DBConnect.getConn(); // Calling a static method to solve
												// the open/close issue of the
												// db
			prepareStatement = conn.prepareStatement("INSERT INTO customers VALUES(default,?,?,?,?)"); // for
																								// id
																								// default
																								// in
																								// MySql,
																								// nothing
																								// in
																								// sqlserver
			prepareStatement.setString(1, customer.getName());
			prepareStatement.setString(2, customer.getLastName());
			prepareStatement.setInt(3, customer.getPhone());
			prepareStatement.setString(4, customer.getEmail());
			prepareStatement.executeUpdate();

		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
		finally
		{
			DBConnect.connClose();
			System.out.println("Closed Connection");
		}
	}

}
