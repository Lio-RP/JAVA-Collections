package javaCollection.vector;

import java.util.*;

public class ReplacingExample {
	
	/**
	 * This program demonstrates how to Replace Vector elements using index
	 * public E set(int index, E element): Replaces the element at the specified position in this Vector with the specified element.
	 */
	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		
		//Add Elements
		vect.add("liban");
		vect.add("Basro");
		vect.add("Suheylo");
		vect.add("Zamiin");
		vect.add("liban");
		vect.add("Basro");
		vect.add("Basro");
		
		System.out.println("Vector elements befpre replacing elements: ");
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		System.out.println();
		
		//Replacing Elements
		vect.set(4, "Roble");
		vect.set(5, "Mohamed");
		
		System.out.println("Vector elements After replacing elements: ");
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		

	}

}
