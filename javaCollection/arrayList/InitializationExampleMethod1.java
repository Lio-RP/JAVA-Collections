package javaCollection.arrayList;

import java.util.*;

public class InitializationExampleMethod1
{
	/**
	 * This Program demonstrates Array list initialization
	 * Method 1: Initialization using Arrays.asList
	 * Syntax:
	 * 	ArrayList<Type> obj = new ArrayList<Type>(
        		Arrays.asList(Object o1, Object o2, Object o3, ....so on));
	 */

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("liban", "basro", "suheylo", "mohamed"));
		
		//Dsiplay the list
		System.out.println(list);
	}

}
