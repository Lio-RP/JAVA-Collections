package javaCollection.vector;

import java.util.*;

public class SortVector {
	
	/**
	 * This program demonstrates How to Sort Vector using Collections.sort
	 * Vector maintains the insertion order which means it displays the elements in the same order, 
	 * in which they got added to the Vector. 
	 */
	public static void main(String[] args) {
		Vector<String> vect = new Vector<String>();
		
		//Add Elements
		vect.add("liban");
		vect.add("Basro");
		vect.add("Suheylo");
		vect.add("Zamiin");
		
		// Collection.sort() sorts the collection in ascending order
		Collections.sort(vect);
		//Display Vector elements after sorting using Collection.sort
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));

	}

}
