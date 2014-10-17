package exercises.stringReverse;

public class ExerciseStringReverse
{
	/*
	 * Print an array backwards. Write a recursive method stringReverse that
	 * takes a character array containing a String as an argument and prints the
	 * String backwards. Hint: Use the String method toCharArray(), to get a
	 * char array containing characters in the String
	 */
	
	public static void main(String[] args)
	{
		String s = "Hello World";
		stringReverse(s.toCharArray(), 0);
		//stringReverseLoop(s.toCharArray());

	}

	private static void stringReverse(char[] wordArr, int i)
	{
		
		if (wordArr.length == i)
		{
			System.out.println();
		}
		else
		{
			stringReverse(wordArr, i + 1);
			System.out.println(wordArr[i]);	
		}
		
	}
	
	private static void stringReverseLoop(char[] charArray)
	{
		for (int i = charArray.length-1; i >= 0 ; i--)
		{
			System.out.print(charArray[i]);
		}
		
	}


	
	


}
