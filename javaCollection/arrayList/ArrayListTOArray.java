package javaCollection.arrayList;

import java.util.*;

public class ArrayListTOArray
{
	/**
	 * This Program demonstrates How to convert ArrayList to string array in java
	 * Method 1: Manual way of conversion using ArrayList get() method
	 * This is a manual way of copying all the ArrayList<String> elements to the String Array[].
	 * 
	 * Method2: Conversion using toArray() method
	 * can convert the ArrayList of string type to the array of Strings. 
	 */

	public static void main(String[] args)
	{
		/**
		 * In this example we have copied the whole list to array in three steps 
		 * a) First we obtained the ArrayList size using size() method 
		 * b) Fetched each element of the list using get() method and finally 
		 * c) Assigned each element to corresponding array element using assignment = operator.
		 */
		/*ArrayList declaration and initialization*/
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements to our list
		alist.add("Liban");
		alist.add("mohamed");
		alist.add("abdullahi");
		alist.add("Basro");
		alist.add("Suhelyo");
		alist.add("Liban");
		
		/*ArrayList to Array Conversion */
		String[] array = new String[alist.size()];
		for(int i = 0; i<alist.size(); i++)
		{
			array[i] = alist.get(i);
		}
		
		//Displayting the array
		for(int i = 0; i<array.length; i++)
			System.out.println(array[i]);
		System.out.println();
		
		/*ArrayList to Array Conversion using toArray() method*/
		System.out.println("Arraylist To Array Using toArray Method");
		String[] arraylist = alist.toArray(new String[alist.size()]);
		
		//Dsiplaying the array
		for(String name: arraylist)
			System.out.println(name);
		
	}

}
