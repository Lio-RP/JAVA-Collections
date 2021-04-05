package javaCollection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class RemovingElement
{
	/**
	 * This program demonstrates Java example of removing elements from the LinkedList
	 * 
	 */

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		list.add("Abdullahi");
		list.add("Suheylo");
		list.add("Zamiin");
		list.add("Mohamed");
		
		//Removing the first element in the list
		list.removeFirst();
		
		//Removing the last element in the list
		list.removeLast();
		
		//Removing specific element in the list
		list.remove(1);
		
		//Iterate the linkedlist
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		  // Removing all the elements from LinkedList
		list.clear();
		System.out.println(list);
		
	}

}
