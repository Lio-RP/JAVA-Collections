package javaCollection.vector;

import java.util.Vector;

public class VectorToStrinArray {

	/**
	 * This program demonstrates how to convert vector to array list
	 *  We are using toString() method of Vector class to do this.
	 *  public String toString(): It returns a string representation of this Vector, 
	 *  containing the String representation of each element.
	 *  Convert the Vector to Array using toArray(new String[vector.size()]).
	 */
	public static void main(String[] args) {
		

		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");
		
		 //Converting Vector to String Array
		String[] array = vect.toArray(new String[vect.size()]);
		
		//Display the string
		System.out.println("String Array Elements");
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);

	}

}
