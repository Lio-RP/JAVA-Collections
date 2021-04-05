package javaCollection.linkedList;

import java.util.*;

public class IteratorLinkedList {
	/**
	 * This program demonstrates how to Iterate linked list
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		list.add("Abdullahi");
		list.add("Suheylo");
		list.add("liban");
		list.add("liban");
		list.add("Zamiin");
		list.add("Basro");
		list.add("Mohamed");
		list.add("Basro");
		
		
		// Obtaining Iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		//LinkedList ListIterator example
		/**
		 * how to iterate a LinkedList using ListIterator. 
		 * Using Listterator we can iterate the list in both the directions(forward and backward). 
		 * Along with traversing, we can also modify the list during iteration, 
		 * and obtain the iterator’s current position in the list.
		 */
		
		// Obtaining ListIterator
		ListIterator<String> listiter = list.listIterator();
		
		// Iterating the list in forward direction
	    System.out.println("Forward iteration:");
	    while(listiter.hasNext())
	    	System.out.println(listiter.next());
	    System.out.println();
	    
	 // Iterating the list in backward direction
	    System.out.println("\nBackward iteration:");
	    while(listiter.hasPrevious())
	    	System.out.println(listiter.previous());
	    System.out.println();
	    
	 //Iterate a LinkedList in reverse sequential order
	  //Program to iterate a LinkedList in reverse order using descendingIterator() method of LinkedList class
	    /* public Iterator<E> descendingIterator(): Returns an 
	      * iterator over the elements in this list in reverse 
	      * sequential order. The elements will be returned in 
	      * order from last (tail) to first (head).
	      */
	    Iterator<String> ite = list.descendingIterator();
	    
	    // Displaying list in reverse order
	    System.out.println("Iterate in descending order:");
	   while(ite.hasNext())
		   System.out.println(ite.next());
	   System.out.println();
	}

}
