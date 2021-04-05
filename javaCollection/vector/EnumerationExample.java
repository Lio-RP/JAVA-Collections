package javaCollection.vector;

import java.util.*;

public class EnumerationExample {
	
	/**
	 * This program demonstrates Vector Enumeration example
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
		
		//Get The Enumeration object;
		Enumeration<String> en = vect.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());

	}

}
