package javaCollection.arrayList;

import java.util.Collections;
import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding Elements to the array list
		list.add("Liban Abduullahi");
		list.add("Basro Abduule");
		list.add("Abduulahi Mohamed");
		list.add("Abdi Mohamed");
		
		//Sort the elements alphabetically
		Collections.sort(list);
		
		//Display the elements
		for(String person:list)
			System.out.println(person);
	}

}
