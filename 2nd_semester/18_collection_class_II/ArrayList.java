package dat14w;

import java.util.Arrays;

public class ArrayList<E>
{
	public E[] elementData;
	private int size;

	public static final int DEFAULT_CAPACITY = 100;

	public ArrayList()
	{
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity)
	{
		elementData = (E[]) new Object[capacity];
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public int get(int index)
	{
		return elementData[index];
	}

	@Override
	public String toString()
	{
		if (size == 0)
		{
			return "[]";
		}
		else
		{
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++)
			{
				result += "," + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	public int indexOf(int value)
	{
		for (int i = 0; i < size; i++)
		{
			if (elementData[i] == value)
			{
				return i;
			}
		}
		return -1;
	}

	// pre: size <= elementData.length
	// post: adds a value to the end of the list
	public void add(int value)
	{
		checkCapacity(size + 1);
		elementData[size] = value;
		size++;
	}

	private void checkCapacity(int capacity)
	{
		if (capacity > elementData.length)
		{
			throw new IllegalStateException("capacity: " + capacity);
		}
	}

	public void ensureCapacity(int capacity)
	{
		if (capacity > elementData.length)
		{
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity)
			{
				newCapacity = capacity;
			}
			int[] newList = new int[newCapacity];
			// for (int i = 0; i < size; i++)
			// {
			// newList[i] = elementData[i]
			// }
			// elementData = newList;

			elementData = Arrays.copyOf(elementData, newCapacity);

		}
	}

	public void add(int index, int value)
	{
		for (int i = size; i >= index + 1; i--)
		{
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
	}

	public void remove(int index)
	{

		for (int i = index; i < size - 1; i++)
		{
			elementData[i] = elementData[i + 1];
		}
		size--;

	}

	public void clear()
	{
		size = 0;
	}

}
