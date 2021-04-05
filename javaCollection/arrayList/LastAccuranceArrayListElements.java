package javaCollection.arrayList;

import java.util.*;

public class LastAccuranceArrayListElements
{
	/**
	 * This Program demonstrates ArrayList lastIndexOf(Object 0bj) Method 
	 * The method lastIndexOf(Object obj) returns the index of last occurrence 
	 * of the specified element in the ArrayList. 
	 * It returns -1 if the specified element does not exist in the list.
	 * Signature:
	 * public int lastIndexOf(Object obj)
	 */

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		//Adding Elements
		numbers.add(1);
		numbers.add(8);
		numbers.add(10);
		numbers.add(1);
		numbers.add(20);
		numbers.add(10);
		numbers.add(20);
		numbers.add(8);
		numbers.add(1);
		
		System.out.println("The last accurrance of the element 1: " + numbers.lastIndexOf(1));
		System.out.println("The last accurrance of the element 1: " + numbers.lastIndexOf(10));
		System.out.println("The last accurrance of the element 1: " + numbers.lastIndexOf(20));
	}

}
