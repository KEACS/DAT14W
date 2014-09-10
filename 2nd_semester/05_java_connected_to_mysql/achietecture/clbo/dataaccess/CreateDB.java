package achietecture.clbo.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateDB
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = DBConnect.getConn();
		PreparedStatement prepareStatement;
		
		prepareStatement = conn.prepareStatement("CREATE DATABASE db_test");
		prepareStatement.execute();

	}

}
