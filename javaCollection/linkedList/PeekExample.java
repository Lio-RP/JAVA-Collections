package javaCollection.linkedList;

import java.util.*;

public class PeekExample {
	
	/**
	 * This program demonstrate LinkedList peek(), peekFirst() and peekLast() methods
	 * public E peek(): Retrieves, but does not remove, the head (first element) of this list.
	 * public E peekFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 * public E peekLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 * 
	 */
	
	public static void main(String[] args)
	{
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
		
		//peek()
		System.out.println(list.peek());
		
		//peekFirst()
		System.out.println(list.peekFirst());
		
		//peekLast()
		System.out.println(list.peekLast());
	}

}
