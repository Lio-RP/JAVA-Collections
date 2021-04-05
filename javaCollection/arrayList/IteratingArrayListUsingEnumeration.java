package javaCollection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class IteratingArrayListUsingEnumeration
{
	/**
	 * This Program demonstrates How to iterate ArrayList elements using Enumeration interface
	 * 
	 */

	public static void main(String[] args)
	{
		ArrayList<String> programmingBooks = new ArrayList<String>();
		
		//Adding Elements to arraylist
		programmingBooks.add("Python");
		programmingBooks.add("java");
		programmingBooks.add("HTML");
		programmingBooks.add("C#");
		programmingBooks.add("Algorithim");
		programmingBooks.add("ASP.NET");
		
		//Get the Enumeration object
		Enumeration<String> enu = Collections.enumeration(programmingBooks);
		
		// Enumerate through the ArrayList elements
		System.out.println("Enumration list");
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
	}

}
