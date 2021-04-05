package javaCollection.linkedList;

import java.util.*;

public class LoopLinked {
	
	/**
	 * This program demonstrates how to loop linkedlist in java
	 * there are four ways to loop:
	 * 1 For Loop
	 * 2 Advanced For Loop
	 * 3 Iterator
	 * 4 While Loop
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		list.add("Abdullahi");
		list.add("Suheylo");
		list.add("Zamiin");
		list.add("Mohamed");
		
		System.out.println("**Foor Loop**");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		System.out.println("**Advanced For Loop**");
		for(String li: list)
			System.out.println(li);
		System.out.println();
		
		System.out.println("**Iterator:**");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
			
		System.out.println();
		
		System.out.println("**While Loop**");
		int count = 0;
		while(count < list.size())
		{
			System.out.println(list.get(count));
			count++;
		}
		
	}

}
