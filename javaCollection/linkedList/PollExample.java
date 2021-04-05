package javaCollection.linkedList;

import java.util.*;

public class PollExample {
	/**
	 * This program demonstrates LinkedList poll(), pollFirst() and pollLast() methods
	 * 
	 */
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements:
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
		
		// Display LinkList elements
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		//LinkedList.poll()
		/* poll(): Retrieves and removes the head (first element)
	      * of this list.
	      */
		System.out.println("Element removed: "+list.poll());
		
		
		//LinkedList.pollFirst()
		//public E pollFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty.
		
		/**
		 * pollFirst(): Retrieves and removes the first element 
         * of this list, or returns null if this list is empty.
		 */
		System.out.println("First Element removed: "+list.pollFirst());
		
		//LinkedList.pollLast()
		//public E pollLast(): Retrieves and removes the last element of this list, or returns null if this list is empty.
		
		/* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
		System.out.println("Last Element removed: "+list.pollLast());
		
	}

}
