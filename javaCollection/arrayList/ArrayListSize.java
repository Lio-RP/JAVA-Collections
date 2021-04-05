package javaCollection.arrayList;

import java.util.*;

public class ArrayListSize {

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding Elements to list
		numbers.add(1);
		numbers.add(5);
		numbers.add(8);
		numbers.add(10);
		
		//Display the size of array list
		System.out.println("the size of number elements in the ArrayList: " + numbers.size());
	}

}
