package lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListVsArrayListEnd
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/13_Java_Collections_Framework/src/lecture/words.txt"));

		List<String> text = new LinkedList<String>();
		while (file.hasNext())
		{
			// System.out.println(file.next());
			text.add(file.next());
		}
		System.out.println("ArrayList is filled!" + text);
		while (!text.isEmpty())
		{
			text.remove(0);

		}
		System.out.print("Array is Empty " + text);

	}

	public static void removeEveryOther(List<String> list)
	{
		for (int i = 0; i < array.length; i++)
		{
			list.remove(i); // performs slow on LinkedList
		}

		Iterator<String> itr = list.iterator();
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

}
