package javaCollection.arrayList;

import java.util.*;

public class IteratingElements {

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements to the list
		alist.add("Liban Abdullahi Mohamed");
		alist.add("Basro Abdulle Abubakar");
		alist.add("Suheylo Liban Abduulahi");
		alist.add("Mohamed Hazzan Abdi");
		
		//Displaying the elements
		for(String element:alist)
			System.out.println(element);
	}

}
