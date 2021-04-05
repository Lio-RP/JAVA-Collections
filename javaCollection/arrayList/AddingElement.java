package javaCollection.arrayList;

import java.util.*;

public class AddingElement
{
	/**
	 * This program demonstrates Java ArrayList add() Method,
	 * ArrayList add(int index, E element), addAll(Collection c) Method, 
	 * addAll(int index, Collection c)Examples
	 * 
	 * 
	 * Signatures of add() method:
	 * public boolean add(Object element) --- adding an element at the end of the list
	 * public void add(int index, Object --- element) This method adds the element at the given index
	 * public boolean addAll(Collection c) --- It adds all the elements of specified Collection c to the current list.
	 * public boolean addAll(int index, Collection c) --- adds all the elements of c at the specified index of a list.
	 * 
	 * 
	 */

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		ArrayList<String> alist2 = new ArrayList<String>();
		
		//Adding Elements to our list
		alist.add("Liban");
		alist.add("mohamed");
		alist.add("abdullahi");
		alist.add("Basro");
		alist.add("Suhelyo");
		
		//Adding elements to the array alist2
		alist2.add("Cali");
		alist2.add("Zamiin");
		alist2.add("Unknow");
		
		//Displaying the list elements
		System.out.println("The Elements of alist array: " + alist);
		System.out.println("The Elements of alist2 array: " + alist2);
		
		
		//Adding new element with a given position
		alist.add(2, "Roble");
		
		//Display the elements
		System.out.println(alist);
		
		//Update or change an element
		alist.set(5, "newe person");
		
		//Display the elements
		System.out.println(alist);
		
		//Adding elements in alist2 to the list of alist
		alist.addAll(alist2);
		
		//Display alist
		System.out.println(alist);
		
		//Adding elements in alist2 to the list of alist by given specific position
		alist.addAll(3, alist2);
		
		//Display alist
		System.out.println(alist);
		
	}

}
