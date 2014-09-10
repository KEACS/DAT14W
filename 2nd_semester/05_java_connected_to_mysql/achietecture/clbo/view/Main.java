package achietecture.clbo.view;

import java.sql.SQLException;

public class Main
{
	public static void main(String[] args) throws SQLException
	{
		CustomerForm cf = new CustomerForm();
		cf.form();
		
//		List<Customer> al = new ArrayList<Customer>();
//		SelectCustomers selectAllCustomers = new SelectCustomers();
//		al = selectAllCustomers.all();
//		for (Customer customer : al)
//		{
//			System.out.println(customer);
//		}

//		System.out.println("-----------------------------------");
//
//		al.clear();
//		al = selectAllCustomers.byId(5);
//		System.out.println(al);
//
//		System.out.println("-----------------------------------");
//
//		al.clear();
//		al = selectAllCustomers.byEmail("clbo@kea.dk");
//		System.out.println(al);
//		
//		System.out.println("-----------------------------------");
//
//		InsertCustomers insertCustomers = new InsertCustomers();
//		insertCustomers.insert("xxx", "xxx", 00000000, "ddd@kea.dk");
//		
//		al.clear();
//		al = selectAllCustomers.byEmail("ddd@kea.dk");
//		System.out.println(al);
		
	}
}
