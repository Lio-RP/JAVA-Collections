package javaCollection.vector;

import java.util.*;

public class IteratorExample {

	/**
	 * This program demonstrates Vector Iterator example
	 * 
	 */
	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");

		//Get Iterator object
		Iterator<String> iter = vect.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
