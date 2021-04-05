package javaCollection.linkedList;

import java.util.*;

public class PopAndPush {
	/**
	 * This programm demonstrates LinkedList push() and pop() methods
	 * Programs to demonstrate push and pop operations on LinkedList.
	 * LinkedList.push(E e)
	 * public void push(E e): Inserts the element at the front of the list.
	 * 
	 * LinkedList.pop()
	 * public E pop(): Removes and returns the first element of the list.
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
		
		// push Element the list
		list.push("New Element");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		System.out.println();
		
		// pop Element from list and display it
		System.out.println("Element removed: " + list.pop());
	}

}
