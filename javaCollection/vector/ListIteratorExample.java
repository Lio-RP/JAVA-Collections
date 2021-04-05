package javaCollection.vector;

import java.util.*;

public class ListIteratorExample {

	/**
	 * This Program demonstrates Vector ListIterator example
	 * We can traverse a Vector in forward and Backward direction using ListIterator. 
	 * Along with this we can perform several other operation using methods of ListIterator API like displaying 
	 * the indexes of next and previous elements, replacing the element value, remove elements during iteration etc.
	 */
	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");
		
		ListIterator<String> listiter = vect.listIterator();
		
		System.out.println("Traversing in Forward Direction:");
		while(listiter.hasNext())
			System.out.println(listiter.next());
		System.out.println();
		
		System.out.println("Traversing in Backward Direction:");
		while(listiter.hasPrevious())
			System.out.println(listiter.previous());

	}

}
