package cumulriveSum;

public class Cumulative
{

	/*
	 * write a method that uses recursion and takes an int as a parameter. 
	 * It should calculate the cumulative sum of all numbers from the parameter and down
	 */
	public static void main(String[] args)
	{
		//System.out.println(cumulativeSum(10));
		System.out.println(cumulativeRecursive(2));
	}

	private static int cumulativeRecursive(int i)
	{
		int sum = 0;
		if (i == 1)
		{
			sum = 1;
		}
		else
		{
			sum = i + cumulativeRecursive(i-1);	
		}
		return sum;
	}

	private static int cumulativeSum(int i)
	{
		int sum = 0;
		for (int j = 0; j <= i; j++)
		{
			sum += j;
		}
		return sum;
	}

}
