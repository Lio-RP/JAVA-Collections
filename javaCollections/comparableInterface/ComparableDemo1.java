package javaCollections.comparableInterface;

import java.util.*;

public class ComparableDemo1 {

	/**
	 * This program demonstrates how to sort Array and Wrapper Classes
	 * @author Roble
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		/*
		 * Integer Class Implements Comparable Interface
		 * so lets see how it sort
		 * */
		int[] array = {11, 32, 2, 67, 4, 54, 25, 29, 0, 1};
		System.out.println("Sorted Integer:");
		Arrays.sort(array);
		System.out.println(	Arrays.toString(array));
		
		/*
		 * String Class Implements Comparable interface 
		 * lets se how it sort
		 * */
		System.out.println("Sorted String: ");
		String[] str = {"Liban", "Basro", "Abdullahi", "Roble"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		
		
		List lst = new ArrayList();
		
		//Add Elements
		lst.add("Liban");
		lst.add("Basro");
		lst.add("Abdullahi");
		lst.add("Roble");
		
		//Sort the list
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println("Sorted ArrayList in reverse order: ");
		System.out.println(lst);

	}

}
