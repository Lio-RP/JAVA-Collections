package javaCollection.arrayList;

import java.util.*;

public class IndexOfExample
{
	/**
	 * This program demonstrates Java ArrayList indexOf() Method
	 * Java.util.ArrayList class method indexOf(Object o) is used to find out the index of a particular element in a list.
	 * this method returns the index of first occurrence of the specified element. 
	 * Signature:
	 * public int indexOf(Object o) -- This method returns -1 if the specified element is not present in the list.
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
		
		System.out.println("index of 'Liban': " + alist.indexOf("Liban"));
		System.out.println("index of 'Basro': " + alist.indexOf("Basro"));
		System.out.println("index of 'Cali': " + alist.indexOf("Cali"));
		
	}

}
