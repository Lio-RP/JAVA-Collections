package javaCollection.vector;

import java.util.*;

public class RemovingExample {

	
	/**
	 * This program demonstrates how to Remove Vector element
	 * public boolean remove(Object o): 
	 * Removes the first occurrence of the specified element from Vector If the Vector does not contain the element, 
	 * it is unchanged.
	 * The remove(Object o) method returns boolean value. 
	 * It returns true if specified element is present in Vector else false.
	 * 
	 * public E remove(int index): Removes the element at the specified position in this Vector. 
	 * Shifts any subsequent elements to the left (subtracts one from their indices). 
	 * Returns the element that was removed from the Vector.
	 * 
	 * public void clear(): Removes all of the elements from this Vector. 
	 * The Vector will be empty after this method call.
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
		
		//Displaying before removing elements
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		System.out.println();
		
		//Remove Elements
		vect.remove("liban");
		vect.remove("Basro");
		
		//Displaying before removing elements
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		
		//Remove element by given speciofic index
		Object obj = vect.remove(3);
		System.out.println("Element removed from the list is :" + obj);
		
		//Remove all elements from the vector
		System.out.println("Vector size before clearing: " + vect.size());
		
		vect.clear();
		System.out.println("Vector size After clearing: " + vect.size());
				
		

	}

}
