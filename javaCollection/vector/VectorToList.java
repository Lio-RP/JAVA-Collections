package javaCollection.vector;

import java.util.*;

public class VectorToList {

	
	/**
	 * This program demonstrates hot to Convert Vector to List example
	 *1) Create a Vector and populate it
	2) Convert it to a List by calling Collections.list(vector.elements()) which returns a List object.
	 */
	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");
		
		//Convert vector to list: 
		List<String> list = Collections.list(vect.elements());
		
		//Display the vector
		System.out.println("List Elements:");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}
