package javaCollection.linkedList;

import java.util.*;

public class LinkedListToArray
{
	/**
	 * this program demonstrates How to convert LinkedList to array using toArray()
	 * Converting LinkedList to array is very easy. You can convert a LinkedList of any type (such as double, String, int etc)
	 * to an array of same type.
	 * 
	 */
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements:
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		list.add("Abdullahi");
		list.add("Suheylo");
		list.add("liban");
		list.add("liban");
		list.add("Zamiin");
		list.add("Basro");
		list.add("Mohamed");
		list.add("Basro");
		
		//Converting LinkedList to Array
		String[] array = list.toArray(new String[list.size()]);
		
		//Displaying Array content
		System.out.println("The Contenets of the array");
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
	
	/**
	 * Note:
	 * In the above example we have taken a LinkedList of Strings, 
	 * however if you have a LinkedList of different type then you can just change the conversion logic like this.
	 * 
	 * For Double LinkedList conversion logic would be:
	 * Double[] array = linkedlist.toArray(new Double[linkedlist.size()]);
	 * 
	 * Similarly for Integer LinkedList conversion logic would be:
	 * Integer[] array = linkedlist.toArray(new Integer[linkedlist.size()]);
	 * 
	 * public T[] toArray(T[] a): It returns an array containing all of the elements in this list in proper sequence (from first to last element); 
	 * the runtime type of the returned array is that of the specified array. 
	 * If the list fits in the specified array, it is returned therein. Otherwise, 
	 * a new array is allocated with the runtime type of the specified array and the size of this list.
	 * 
	 * If the list fits in the specified array with room to spare (i.e., the array has more elements than the list), 
	 * the element in the array immediately following the end of the list is set to null. 
	 * (This is useful in determining the length of the list only if the caller knows that the list does not contain any null elements.)
	 */

}
