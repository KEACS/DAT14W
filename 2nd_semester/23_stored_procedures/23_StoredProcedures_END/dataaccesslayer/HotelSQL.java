package Dat14V1.dataaccesslayer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dat14V1.applicationlayer.datatypes.Hotel;


public class HotelSQL
{
	private Connection conn;
	private ResultSet result = null;
	//private PreparedStatement prepareStatement;
	private CallableStatement callableStament;
	Hotel hotel;

	public Hotel selectHotel(int hotelNo) throws SQLException
	{	
		try
		{
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel?user=root&password=");
			callableStament = this.conn.prepareCall("{call SP_getHotel(?)}");
			callableStament.setInt(1, hotelNo);
			result = callableStament.executeQuery();

			while (result.next())
			{
				int hotelId = result.getInt(1);
				String hotelName = result.getString(2);
				String city = result.getString(3);

				hotel = new Hotel(hotelId, hotelName, city);
			}
		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
		finally
		{
			this.conn.close();
		}

		return hotel;
	}

}
