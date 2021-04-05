package javaCollection.vector;

import java.util.*;

public class SearchinElement {
	
	/**
	 * This program demonstrates how to Search elements in Vector using index
		* 1) public int indexOf(Object o): It returns the index of first occurrence of Object o in Vector.
		2) public int indexOf(Object o, int startIndex): It returns the index of the first occurrence of the Object o in this vector, searching forwards from startIndex (inclusive).
		3) public int lastIndexOf(Object o): It returns the index of last occurrence of Object o in Vector.
		4) public int lastIndexOf(Object o, int startIndex): It returns the index of the last occurrence of the specified element in this vector, searching backwards from startIndex(inclusive).
		
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
		
		//This would return the index of first occurrence
	     int first_index = vect.indexOf("liban");
	     System.out.println("First Occurrence of Patt at index: "+first_index);
	 
	     //This would return the index of last occurrence
	     int last_index = vect.lastIndexOf("Basro");
	     System.out.println("Last Occurrence of Patt at index: "+last_index);
	 
	     //This would start search from index 2(inclusive)
	     int after_index = vect.indexOf("liban", 2);
	     System.out.println("Occurrence after index 2: "+after_index);
	 
	     //This would search the element backward starting from index 6(inclusive)
	     int before_index = vect.lastIndexOf("liban", 6);
	     System.out.println("Occurrence before index 6: "+before_index);
		

	}

}
