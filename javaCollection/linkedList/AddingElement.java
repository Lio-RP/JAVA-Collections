package javaCollection.linkedList;

import java.util.*;

public class AddingElement
{
	/**
	 * This program demonstrates Java Linked List example of adding elements
	 * we are using add(), addFirst() and addLast() methods to add the elements 
	 * at the desired locations in the LinkedList
	 */

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		
		//Adding element to first position
		list.addFirst("Abdullahi");
		
		//Adding Element to the last
		list.addLast("Zamiin");
		
		//Adding Element specific position
		list.add(2, "Suheylo");
		
		//Iterate the linkedlist
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		// Adding element to front of LinkedList
	     /* public boolean offerFirst(E e): Inserts the 
	      * specified element at the front of this list.
	      */
	     list.offerFirst("NEW Element");
	     System.out.println(list);
	     
	   //Append all the elements of a List to LinkedList
		 // create a new list having few elements
		List<String> arrayList = new ArrayList<String>();
		
		//Initialize the arraylis
		arrayList.add("Xaliimo");
		arrayList.add("Maryamo");
		
		//Append all list element to the linked list
		list.addAll(arrayList);
		
		//Display the elements
		System.out.println(list);

	}

}
