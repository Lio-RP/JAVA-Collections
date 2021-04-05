package javaCollection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList
{
	/**
	 * This Program demonstrates How to swap two elements in an ArrayList
	 * We are using Collections.swap() method for swapping.
	 * SIGNATURE:
	 * public static void swap(List list, int i1, int i2)
	 * This method swaps the element of index i1 with the element of index i2. 
	 * It throws IndexOutOfBoundsException – if either i1 or i2 is less than zero or greater 
	 * than the size of the list (i1 < 0 || i1 >= list.size() || i2 < 0 || i2 >= list.size()).
	 */
	public static void main(String[] args)
	{
		ArrayList<String> alist1 = new ArrayList<String>();
		
		//Adding Elements to our list
		alist1.add("Liban");
		alist1.add("mohamed");
		alist1.add("abdullahi");
		alist1.add("Basro");
		alist1.add("Liban");
		alist1.add("Suhelyo");
		
		System.out.println("ArrayList Before swaping");
		for(String list: alist1)
			System.out.println(list);
		System.out.println();
		
		System.out.println("After swaping");
		Collections.swap(alist1, 0, 3);
		for(String list: alist1)
			System.out.println(list);
		System.out.println();
	}

}
