package achietecture.clbo.application;

import achietecture.clbo.application.datatypes.Customer;
import achietecture.clbo.dataaccess.InsertCustomers;

public class InsertCustomer
{
	InsertCustomers insertCustomers = new InsertCustomers();
	
	public void insert(Customer customer)
	{
		insertCustomers.insert(customer);
		// customer.getName(), customer.getLastName(),customer.getPhone(), customer.getEmail()
	}
}
