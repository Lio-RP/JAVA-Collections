package javaCollection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescendingOrder
{
	/**
	 * This program demonstrates How to sort ArrayList in descending order in Java
	 * We are using Collections.reverseOrder() method along with Collections.sort() 
	 * in order to sort the list in decreasing order. 
	 * In the below example we have used the following statement for sorting in reverse order.
	 * Collections.sort(arraylist, Collections.reverseOrder());
	 * However the reverse order sorting can also be done as following – This way 
	 * the list will be sorted in ascending order first and then it will be reversed.
		Collections.sort(list);
		Collections.reverse(list);
	 */

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("Z");
		list.add("X");
		list.add("R");
		
		/*Unsorted List: ArrayList content before sorting*/
		System.out.println("Before sorting the elements: ");
		for(String element:list)
			System.out.println(element);
		
		/* Sorting in descending order*/
		System.out.println("Sort in descending order:");
		Collections.sort(list, Collections.reverseOrder());
		for(String element:list)
			System.out.println(element);
		
	}

}
