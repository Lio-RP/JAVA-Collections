package javaCollection.linkedList;

import java.util.*;

public class ReplaceElement {
	
	/**
	 * This program demonstrates Replace element in a LinkedList example
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
		
		//Replacing element
		list.set(5, "Roble");
		for(String li: list)
			System.out.println(li);

	}

}
