package javaCollection.arrayList;

import java.util.*;

public class CompareTwoArrayList
{
	/**
	 * This Program demonstrates How to compare two ArrayList in Java
	 * We would be using contains() method for comparing two elements of different ArrayList.
	 * SIGNATURE:
	 * public boolean contains(Object o)
	 * It returns true if the list contains the Object o else it returns false.
	 */
	public static void main(String[] args)
	{
		ArrayList<String> alist1 = new ArrayList<String>();
		
		//Adding Elements to our list
		alist1.add("Liban");
		alist1.add("mohamed");
		alist1.add("abdullahi");
		alist1.add("Basro");
		alist1.add("Liban");
		alist1.add("Suhelyo");
		
		
		ArrayList<String> alist2 = new ArrayList<String>();
		
		//Adding Elements to our list
		alist2.add("Liban");
		alist2.add("mohamed");
		alist2.add("rOBLE");
		alist2.add("CALI");
		alist2.add("CABDI");
		alist2.add("Basro");
		
		ArrayList<String> alist3 = new ArrayList<String>();
		for(String list: alist1)
		{
			alist3.add(alist2.contains(list) ? "Yes":"No");
		}
		System.out.println(alist3);
		
		ArrayList<Integer> alist4 = new ArrayList<Integer>();
		for(String list: alist1)
		{
			alist4.add(alist2.contains(list)? 1:0);
		}
		System.out.println(alist4);
	}
	
	/**
	 * What is the logic in above code?
	 * If the first element of ArrayList al1 is present in al2 then ArrayList 
	 * al3 would be having “Yes” and al4 would be having “1” 
	 * However if the element is not present “No” would be stored in al3 and 0 would be in al4.
	 */

}
