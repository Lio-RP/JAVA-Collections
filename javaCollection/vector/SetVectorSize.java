package javaCollection.vector;

import java.util.*;

public class SetVectorSize {

	/**
	 * This program demonstrates how set the size of the vectore
	 * We can set the size of a Vector using setSize() method of Vector class. 
	 * If new size is greater than the current size then all the elements after current size index have null values.
	 * If new size is less than current size then the elements after current size index have been deleted from the Vector.
	 */
	public static void main(String[] args) {
		
		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");
		
		//Setsize greater than the current size
		vect.setSize(10);
		System.out.println("Size of the vector is: " + vect.size());
		System.out.println("Vector Elements: ");
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		System.out.println();
		
		//SetSize less than the current size:
		vect.setSize(5);
		System.out.println("vector size is: " + vect.size());
		System.out.println("Vector Elements: ");
		for(int i = 0; i < vect.size(); i++)
			System.out.println(vect.get(i));
		

	}

}
