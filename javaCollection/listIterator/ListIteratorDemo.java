package javaCollection.listIterator;

import java.util.*;

public class ListIteratorDemo
{
	/**
	 * This program demonstrates how to iterate a list using ListIterator.
	 * @author Roble
	 * 
	 * We can use Iterator to traverse List and Set both but using ListIterator we can only traverse list.
	 */

	public static void main(String[] args)
	{
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//Add Elements 
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add("Item3");
		arrayList.add("Item4");
		arrayList.add("Item5");
		arrayList.add("Item6");
		arrayList.add("Item7");
		
		//Declare ListIterator object and asign the list
		ListIterator<String> liter = arrayList.listIterator();
		
		System.out.println("Traversing the list in forward direction:");
		while(liter.hasNext())
		{
			System.out.println(liter.next());
		}
		
		System.out.println("\nTraversing the list in backward direction:");
		while(liter.hasPrevious())
		{
			System.out.println(liter.previous());
		}
	}

}
