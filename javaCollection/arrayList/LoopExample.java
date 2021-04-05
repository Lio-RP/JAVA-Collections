package javaCollection.arrayList;

import java.util.*;

public class LoopExample
{
	/**
	 * this program demonstrates How to loop ArrayList in Java
	 * There are four ways to loop ArrayList:
	 *  1.	For Loop
		2.	Advanced for loop
		3.	While Loop
		4.	Iterator
	 */
	public static void main(String[] args)
	{
		ArrayList<String> programmingBooks = new ArrayList<String>();
		
		programmingBooks.add("Python");
		programmingBooks.add("java");
		programmingBooks.add("HTML");
		programmingBooks.add("C#");
		programmingBooks.add("Algorithim");
		programmingBooks.add("ASP.NET");
		
		//Sort the elements
		Collections.sort(programmingBooks);
		
		/* For Loop for iterating ArrayList */
		System.out.println("Using For Loop for iteration ArrayList");
		for(int counter = 0; counter < programmingBooks.size(); counter++)
			System.out.println(programmingBooks.get(counter));
		System.out.println();
		
		/* Advanced For Loop*/
		System.out.println("Using Advanced For Loop for iteration ArrayList");
		for(String book:programmingBooks)
			System.out.println(book);
		System.out.println();
		
	      /* While Loop for iterating ArrayList*/
		System.out.println("Using While Loop for iteration ArrayList");
		int counter = 0;
		while (counter < programmingBooks.size())
		{
			System.out.println(programmingBooks.get(counter));
			counter++;
		}
		System.out.println();
		
		/*Looping Array List using Iterator*/
		System.out.println("Using Iterator for iteration ArrayList");
		Iterator<String> iter = programmingBooks.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
