package javaCollection.arrayList;

import java.util.*;

public class InitializationExampleMethod3
{
	/**
	 * This Program demonstrates Array list initialization
	 * Method3: Normal way of ArrayList initialization
	 * Syntax:
	 * 	ArrayList<T> obj = new ArrayList<T>();
	   obj.add("Object o1");
	   obj.add("Object o2");
	   obj.add("Object o3");
                        ...
                        ...
	 * 
	 */

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(10);
		
		//Display
		System.out.println(numbers);
	}

}
