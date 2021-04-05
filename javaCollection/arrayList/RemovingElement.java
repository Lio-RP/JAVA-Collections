package javaCollection.arrayList;

import java.util.*;


public class RemovingElement
{
	/**
	 * This Program demonstrates a remove() method
	 * 
	 * signature:
	 * public Object remove(int index) -- is used for removing an element of the specified index from a list
	 * public boolean remove(Object obj) -- removes the specified object from the list
	 * NOTE:
	 * 		•	It returns false if the specified element doesn’t exist in the list.
			•	If there are duplicate elements present in the list it removes the first occurrence of the specified element from the list.
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
		
		//Displaying the list elements
		System.out.println(alist);
		
		//Removing Element from the array;
		alist.remove("Suhelyo");
		alist.remove(1);
		
		//Display elements
		System.out.println(alist);
		
	      /*This element is not present in the list so
	        * it should return false
	        */
		boolean b = alist.remove("Ayaan");
		System.out.println("The person Ayaan is removed from the list: " + b);
	}

}
