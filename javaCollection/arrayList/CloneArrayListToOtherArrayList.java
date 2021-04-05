package javaCollection.arrayList;

import java.util.*;

public class CloneArrayListToOtherArrayList
{
	/**
	 * This program demonstrates How to clone an ArrayList to another ArrayList
	 * We would be using clone() method of ArrayList class to serve our purpose.
	 * Object clone() This method returns a shallow copy of the ArrayList instance.
	 * 
	 */

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		 //Adding elements to the ArrayList
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		System.out.println("ArrayList Elements: " + list1);
		
		ArrayList<String> list2 = (ArrayList<String>)list1.clone();
		System.out.println("Coloned ArrayList: " + list2);
		
		//Adding and Removinf elements in the cloned array list
		list2.add("Yousuf mohamed");
		list2.remove(0);
		
		System.out.println("The Original ArrayList: " + list1);
		System.out.println("Cloned ArrayList: " + list2);
	}

}
