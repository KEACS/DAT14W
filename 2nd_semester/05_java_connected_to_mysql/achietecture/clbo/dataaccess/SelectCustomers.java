package achietecture.clbo.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import achietecture.clbo.application.datatypes.Customer;

public class SelectCustomers
{
	private Connection conn;
	private PreparedStatement prepareStatement = null;
	private ResultSet result = null;
	private List<Customer> al = new ArrayList<Customer>();
	
	public List<Customer> all() 
	{
		try
		{
			this.conn = DBConnect.getConn(); // Calling a static method to solve the open/close issue of the db
			prepareStatement = conn.prepareStatement("SELECT * FROM customers");
			result = prepareStatement.executeQuery();
			
			while (result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				int phone = result.getInt("phone");
				String email = result.getString("email");

				al.add(new Customer(id,name,lastName,phone,email));
			}
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
		
		return al;
	}

	public List<Customer> byId(int idOfCustomer) 
	{
		try
		{
			this.conn = DBConnect.getConn();
			prepareStatement = conn.prepareStatement("SELECT * FROM customers WHERE id = ?");
			prepareStatement.setInt(1, idOfCustomer);
			result = prepareStatement.executeQuery();
			
			while (result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				int phone = result.getInt("phone");
				String email = result.getString("email");

				al.add(new Customer(id,name,lastName,phone,email));
			}
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
		
		return al;
	}

	public List<Customer> byEmail(String emailOfCustomer) 
	{
		try
		{
			this.conn = DBConnect.getConn();
			prepareStatement = conn.prepareStatement("SELECT * FROM customers WHERE email = ?");
			prepareStatement.setString(1, emailOfCustomer);
			result = prepareStatement.executeQuery();
			
			while (result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				int phone = result.getInt("phone");
				String email = result.getString("email");

				al.add(new Customer(id,name,lastName,phone,email));
			}
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
		
		return al;
	}
	

}
