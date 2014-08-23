import java.util.ArrayList;


public class Main
{

	public static void main(String[] args)
	{
		Car car = new Car(4, "red", 3.5);
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(car);
		carList.add(new Car(6, "blue", 1.1));
		
		
		for (Car car2 : carList)
		{
			System.out.println(car2);
			
			System.out.println(car2.getColor());
		}
		
		
		
//		int i = 0;
//		double d = 2.5;
//		char c = 'e';
//		boolean b = true; 

	}

}
