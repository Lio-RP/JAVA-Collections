package javaCollection.linkedList;

import java.util.*;

public class GetAndSearchElement
{
	/**
	 * This Program demonstrates how to get and search elements from linked list
	 *
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements
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
		
		//Display the list
		System.out.println("Original list:");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		//Get Fist and LAST eLEMENTS FROM THE LINKED LIST
		Object firstelement = list.getFirst();
		System.out.println("The First element of the list: " + firstelement);
		Object lastelement = list.getLast();
		System.out.println("The Last element of the list: " + lastelement);
		System.out.println();
		
		//Getting element from specific index of linked list
		System.out.println("Element from the given index is: " + list.get(1) + "\n");
		
		
		//Search Element from the liked List:
		System.out.println("The index of first accurance the element 'liban' is: " + list.indexOf("liban"));
		System.out.println("The index of last accurance the element 'Basro' is: " + list.lastIndexOf("Basro") + "\n");
		
		// Obtaining Sublist from the LinkedList
		List<String> sublist = list.subList(1, 6);
		
		//Displaying the sublist
		System.out.println("Original sublist: ");
		Iterator<String> itersub = sublist.iterator();
		while(itersub.hasNext())
			System.out.println(itersub.next());
		System.out.println();
		
		/* Any changes made to Sub List will be reflected
	     * in the original List. Lets take this example - We
	     * are removing element "Leylo" from sublist and it 
	     * should be removed from original list too. Observe 
	     * the Output of this part of the program.
	     */
		
		sublist.remove("Leylo");
		System.out.println("Sublist After Removing element");
		Iterator<String> sub = sublist.iterator();
		while(sub.hasNext())
			System.out.println(sub.next());
		System.out.println();
		
		//Display the list
		System.out.println("Effect after removing elemenet from the sublist:");
		Iterator<String> iterlist = list.iterator();
		while(iterlist.hasNext())
			System.out.println(iterlist.next());
		System.out.println();

	}

}
