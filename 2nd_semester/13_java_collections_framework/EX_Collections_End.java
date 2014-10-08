package lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class EX_Collections_End
{
	static List<Integer> numbers = new LinkedList<Integer>();

	public static void main(String[] args)
	{
		// 1. Make a method that populates an ArrayList with 100.000 random
		// numbers, and print the numbers
		populate();
		System.out.println("ArrayList is filled!" + numbers);
		removeEverySecond(numbers);
		// // 2. Make a method that removes all numbers by always removing the
		// first index (remove(0)), and print the Array after removing
		// removeAllFromStart();
		System.out.print("Array is Empty " + numbers);
		// // 3. Change it to using a LinkedList instead. Make sure to use the
		// ADT interface List as the type
	}

	private static void removeEverySecond(List<Integer> numb)
	{
//		for (int i = 0; i < numb.size(); i = i + 2)
//		{
//			numb.remove(i); // this is slow for linkedList
//		}
		
		Iterator itr = numb.iterator();
		while (itr.hasNext())
		{
			itr.next();
			if (itr.hasNext())
			{
				itr.remove();
				itr.next();
			}
		
			
		}
		

	}

	public static void populate()
	{
		Random rand = new Random();
		for (int i = 0; i <= 200000; i++)
		{
			int temp = rand.nextInt(1000);
			numbers.add(temp);
		}
	}

	public static void removeAllFromStart()
	{

		while (!numbers.isEmpty())
		{
			numbers.remove(0); // numbers.size() - 1
		}

	}

}
