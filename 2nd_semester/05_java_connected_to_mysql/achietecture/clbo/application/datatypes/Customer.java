package achietecture.clbo.application.datatypes;

public class Customer
{
	private int id;
	private String name;
	private String lastName;
	private int phone;
	private String email;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getPhone()
	{
		return phone;
	}
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}

	public Customer(int id, String name, String lastName, int phone, String email)
	{
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}
	public Customer(String name, String lastName, int phone, String email)
	{
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString()
	{
		return id + ", " + name + ", " + lastName + ", " + phone + ", " + email;
	}
}
