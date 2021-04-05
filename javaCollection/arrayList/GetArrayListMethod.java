package javaCollection.arrayList;

import java.util.*;

public class GetArrayListMethod
{
	/**
	 * This Program demonstrates ArrayList get() Method
	 * ArrayList get(int index) method is used for fetching an element from the list. 
	 * We need to specify the index while calling get method and it returns the value present at the specified index.
	 * SIGNATURE:
	 * public Element get(int index)
	 * This method throws IndexOutOfBoundsException if the index is less than zero or greater than 
	 * the size of the list (index<0 OR index>= size of the list).
	 * 
	 */
	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements to our list
		alist.add("Liban");
		alist.add("mohamed");
		alist.add("abdullahi");
		alist.add("Basro");
		alist.add("Suhelyo");
		
		System.out.println("The first person of the list: " + alist.get(0));
		System.out.println("The third person of the list: " + alist.get(2));
		System.out.println("The fourth person of the list: " + alist.get(3));
	}

}
