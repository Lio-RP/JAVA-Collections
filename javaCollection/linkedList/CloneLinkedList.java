package javaCollection.linkedList;

import java.util.*;

public class CloneLinkedList {
	/**
	 * This Program demonstrates Clone a generic LinkedList in Java
	 * 
	 */
	@SuppressWarnings("unchecked")
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
		
		//Displaye the list
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		// Creating another list
		LinkedList<String> list2 = new LinkedList<String>();
		
		// Clone list to list2
	     /* public Object clone(): Returns a shallow copy of this
	      * LinkedList. (The elements themselves are not cloned.)
	      */
		list2 = (LinkedList<String>)list.clone();
		
		System.out.println("Cloned linked list");
		Iterator<String> it = list2.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
	}

}
