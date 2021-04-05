package javaCollection.arrayList;

import java.util.*;

public class ArrayToArrayList
{
	/**
	 * This Program demonstrates How to convert an array to ArrayList in java
	 * String array[] to ArrayList<String>
	 * Method 1: Conversion using Arrays.asList()
	 * SYNTAX:
	 * ArrayList<T> arraylist= new ArrayList<T>(Arrays.asList(arrayname));
	 * 
	 * Method 2: Collections.addAll method
	 * Collections.addAll method all the array elements to the specified collection.
	 * This is how Collections.addAll method is being called. 
	 * It does the same as Arrays.asList method however it is much faster than 
	 * it so performance wise this is a best way to get the array converted to ArrayList.
	 * String array[]={new Item(1), new Item(2), new Item(3), new Item(4)};
		ArrayList<T> arraylist = new ArrayList<T>();
		Collections.addAll(arraylist, array);
		OR
		
		Collections.addAll(arraylist, new Item(1), new Item(2), new Item(3), new Item(4));
		
	 *Method 3: Manual way of doing things
	 *We can also add all the array’s element to the array list manually
	 */

	public static void main(String[] args)
	{
		System.out.println("Method 1: Conversion using Arrays.asList()");
		 //Method 1: Conversion using Arrays.asList()
			  /* Array Declaration and initialization*/
			String[] citynames = {"Beledweyne", "Laascaanood", "Kismaayo", "Garowe", "galkacyo"};
			
			  /*Array to ArrayList conversion*/
			ArrayList<String> cityList = new ArrayList<String>(Arrays.asList(citynames));
			
			  /*Adding new elements to the converted List*/
			cityList.add("Boosaaso");
			cityList.add("Benaadir");
			
			//Displaying the array lis
			for(String name: cityList)
				System.out.println("City: " + name);
			System.out.println();
			
			System.out.println("Method 2: Collections.addAll method");
			//Method 2: Collections.addAll method
			/*ArrayList declaration*/
			ArrayList<String> list = new ArrayList<>();
			
			/*Conversion*/
			Collections.addAll(list, citynames);
			
			/*Adding new elements to the converted List*/
			list.add("Boosaaso");
			list.add("Benaadir");
			
			/*Display array list*/
			for(String name:list)
				System.out.println("cities: " + name);
			System.out.println();
			
			System.out.println("Method 3: Manual way of doing things");
			//Method 3: Manual way of doing things
			
		    /*ArrayList declaration*/
			ArrayList<String> arraylist = new ArrayList<String>();
			
			
			/*Initialized Array*/
			String[] array = {"Beledweyne", "Laascaanood", "Kismaayo", "Garowe", "galkacyo"};
			
			/*array.length returns the current number of 
				     * elements present in array*/
			for(int i = 0; i<array.length; i++)
			{
				/* We are adding each array's element to the ArrayList*/
				arraylist.add(array[i]);
			}
			         
			    /*ArrayList content*/
			for(String names:arraylist)
				System.out.println("Cities: " + names);




	}

}
