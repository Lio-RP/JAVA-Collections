package javaCollection.arrayList;

import java.util.*;

public class ContainsExample
{
	/**
	 * This Program demonstrates Java ArrayList contains() Method example
	 * ArrayList contains() method is used for checking the specified element existence in the given list.
	 * SIGNATURE:
	 * public boolean contains(Object element) --It returns true if the specified element is found in the list else it gives false.
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements to our list
		alist.add("Liban");
		alist.add("mohamed");
		alist.add("abdullahi");
		alist.add("Basro");
		alist.add("Suhelyo");
		alist.add("Liban");
		
		System.out.println("Contains in the ArrayList the string 'liban': " + alist.contains("Liban"));
		System.out.println("Contains in the ArrayList the string 'Roble': " + alist.contains("Roble"));
		
		
	}

}
