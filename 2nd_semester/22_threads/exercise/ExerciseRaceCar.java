package chrk.racecar.clbo;

public class ExerciseRaceCar
{
	private int finish;
	private String name;
	
	public ExerciseRaceCar(int finish, String name)
	{
		this.finish = finish;
		this.name = name;
	}
	
	public void run()
	{
		for(int i = 1; i <= finish; i++)
		{	
			System.out.println(name + " lab " + i);
		}
		System.out.println(name + " finished!");
	}
}
