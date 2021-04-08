package javaCollections.set.treeSet;

import java.util.*;

public class TreeSetExample {

	/**
	 * This prograsm demonstrates TreeSet Class Examble
	 * Description of treeset
	 * TreeSet is similar to HashSet except that it sorts the elements in the ascending order 
	 * while HashSet doesn’t maintain any order. TreeSet allows null element but like HashSet it doesn’t allow. 
	 * Like most of the other collection classes this class is also not synchronized, 
	 * however it can be synchronized explicitly like this: 
	 * SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
	 */
	public static void main(String[] args) {
		
		//Declare a TreeSet object
		TreeSet<String> tset = new TreeSet<String>();
		
		//Adding Elements
		tset.add("Item5");
		tset.add("Item2");
		tset.add("Item4");
		tset.add("Item3");
		tset.add("Item1");
		tset.add("Item6");
		tset.add("Item8");
		tset.add("Item7");
		tset.add("Item9");
		
		//Dsiplaye the Elements
		System.out.println(tset);
		
		//Declare a TreeSet object of type Integer
		TreeSet<Integer> tSetint = new TreeSet<Integer>();
		
		//Adding Elements
		tSetint.add(10);
		tSetint.add(2);
		tSetint.add(7);
		tSetint.add(9);
		tSetint.add(5);
		tSetint.add(4);
		tSetint.add(1);
		tSetint.add(3);
		tSetint.add(6);
		tSetint.add(8);
		
		//Display the elements:
		System.out.println(tSetint);
		
		

	}

}
