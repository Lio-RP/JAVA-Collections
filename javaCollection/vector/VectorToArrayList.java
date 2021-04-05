package javaCollection.vector;

import java.util.*;

public class VectorToArrayList {

	
	/**
	 * This progtram demonstrates hpw to converto vector to arraylist
	 *Converted the Vector to ArrayList by Declaring ArrayList object using Vector object.
		ArrayList list = new ArrayList(vector);
	 */
	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		
		//Adding elements
		vect.add("Item1");
		vect.add("Item2");
		vect.add("Item3");
		vect.add("Item4");
		vect.add("Item5");
		
		ArrayList<String> arraylist = new ArrayList<String>(vect);
		
		//Display the elements of arraylist
		System.out.println("ArrayList Elements");
		for(int i = 0; i < arraylist.size(); i++)
			System.out.println(arraylist.get(i));
	}

}
