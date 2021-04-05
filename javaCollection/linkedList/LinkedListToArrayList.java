package javaCollection.linkedList;

import java.util.*;

public class LinkedListToArrayList
{
	/**
	 * Thisd program demonstrate Convert a LinkedList to ArrayList
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
		
		List<String> arraylist = new ArrayList<String>(list);
		// Display LinkList elements
		Iterator<String> iter = arraylist.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
	}

}
