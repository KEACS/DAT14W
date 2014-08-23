public class Car
{
	// Fields
	private int wheels;
	private String color;
	private double cc;

	public Car(int wheels, String color, double cc)
	{
		this.setWheels(wheels);
		this.setColor(color);
		this.setCc(cc);
		
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getCc()
	{
		return cc;
	}

	public void setCc(double cc)
	{
		this.cc = cc;
	}
	
	public void run()
	{
		System.out.println("Car running");
	}
	
	@Override
	public String toString()
	{
		return wheels + ", " + color + ", " + cc;
	}

}
