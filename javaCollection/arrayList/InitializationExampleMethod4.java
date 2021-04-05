package javaCollection.arrayList;

import java.util.*;

public class InitializationExampleMethod4
{
	/**
	 * This Program demonstrates Array list initialization
	 * Method 4: Use Collections.ncopies
	 * Collections.ncopies method can be used when we need to initialize
	 * the ArrayList with the same value for all of its elements. 
	 * Syntax: ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
	 * count is number of elements and element is the item value
	 */
	
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(Collections.nCopies(10, 20));
		
		//Display the list elements
		System.out.println(numbers);
	}

}
