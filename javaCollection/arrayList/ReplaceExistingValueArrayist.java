package javaCollection.arrayList;

import java.util.*;

public class ReplaceExistingValueArrayist
{
	/**
	 * This Program demonstrates Java ArrayList set() Method example
	 * If there is a need to update the list element based on the index then 
	 * set method of ArrayList class can be used. 
	 * The method set(int index, Element E) updates the element of specified index with the given element E.
	 * SIGNATURE:
	 * public E set(int index, Element E)
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
		System.out.println("Before updating the list: " + list1);
		System.out.println();
		
		//Replacing an element to another element
		list1.set(3, "Suheylo Liban");
		System.out.println("After updating the list: " + list1);
		
	}

}
