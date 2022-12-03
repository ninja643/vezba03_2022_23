package rs.ac.ni.pmf.oop2.vezba3.lists;

import java.util.*;

public class ListsDemo
{
	public static void shuffleArray()
	{
		final Random random = new Random();

		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };

		for (int i = 1; i < a.length; i++)
		{
			final int j = random.nextInt(i + 1);
			if (i != j)
			{
				int pom = a[i];
				a[i] = a[j];
				a[j] = pom;
			}
		}

		for (final int i : a)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();

	}

	public static void shuffleList()
	{
		LinkedList
		final List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 6; i++)
		{
			list.add(i);
		}

		Collections.shuffle(list);

		for (final int i : list)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		shuffleList();
	}
}

