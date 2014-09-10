package achietecture.clbo.view;

import java.util.Scanner;
import achietecture.clbo.application.InsertCustomer;
import achietecture.clbo.application.datatypes.Customer;
import achietecture.clbo.dataaccess.SelectCustomers;

public class CustomerForm
{
	Scanner input = new Scanner(System.in);
	InsertCustomer insertCustomer = new InsertCustomer();
	SelectCustomers select = new SelectCustomers();

	public void form()
	{
		System.out.println("Dear Customer, please fill out the form");
		System.out.print("First Name: ");
		String name = input.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Phone number: ");
		int phone = input.nextInt();
		
		System.out.print("Email: ");
		String email = input.next();
		System.out.println();
		
		insertCustomer.insert(new Customer(name, lastName, phone, email));

		System.out.println(select.byEmail(email));

	}

}
