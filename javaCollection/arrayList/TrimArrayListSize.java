package javaCollection.arrayList;

import java.util.*;

public class TrimArrayListSize
{
	/**
	 * This Program Demonstrates Java ArrayList trimToSize() Method example
	 * trimToSize() method is used for memory optimization. 
	 * It trims the capacity of ArrayList to the current list size. 
	 * For e.g. An arraylist is having capacity of 15 but there are only 5 elements in it, 
	 * calling trimToSize() method on this ArrayList would change the capacity from 15 to 5.
	 * SIGNATUIRE:
	 * public void trimToSize()
	 */

	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>(20);
		
		
		 //Adding elements to the ArrayList
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		list1.trimToSize();
		System.out.println(list1);
	}

}
