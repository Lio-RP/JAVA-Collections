package javaCollection.arrayList;

import java.util.*;

public class CheckingArrayList
{
	/**
	 * This Progtram demonstrates Java ArrayList isEmpty() Method example
	 * isEmpty() method of java.util.ArrayList class is used for checking 
	 * whether the list is empty or not. This method returns a boolean value.
	 * SIGNATURE:
	 * public boolean isEmpty() -- It returns true if the list is empty otherwise it gives false.
	 */

	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		System.out.println("is the arraylis is empty: " + list1.isEmpty());
		
		 //Adding elements to the ArrayList
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		
		System.out.println("is the arraylis is empty: " + list1.isEmpty());
		
		for(String list: list1)
			System.out.println(list);
	}

}
