package exercises.nestedforloop;

public class ExerciseTower
{
	/*
	 * Remeber 1st semester and the nested for loops :)
	 * Underneath is one of them.
	 * Write a recursive method called recursive() which takes an int as an argument
	 * The int describes how many lines of stars are in the figure.
	 * 	
	 	*******
	 	******
	 	*****
	 	****
	 	***
	 	**
	 	*
	 * When done make the method print out the figure upside down (first line 1 *).
	 */
	public static void main(String[] args)
	{
//		nestedForLoop(7);
		recursive(7);

	}

	private static void recursive(int i)
	{
		if (i == 0)
		{
			System.out.println();
		}
		else
		{
			
			for (int star = 1; star <= i; star++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			recursive(i-1);
		}
		
	}

	private static void nestedForLoop(int lines)
	{
		for (int line = 0; line <= lines; line++)
		{
			// stars
			for (int star = 1; star <= line; star++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
