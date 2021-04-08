package javaCollections.map.treeMap;

import java.util.*;

public class GetSize {

	public static void main(String[] args) {
		

		TreeMap<String, String> tremap = new TreeMap<String, String>();
		
		//Add Elements
		tremap.put("Key1", "Item1");
		tremap.put("Key2", "Item2");
		tremap.put("Key3", "Item3");
		tremap.put("Key4", "Item4");
		tremap.put("Key5", "Item5");
		tremap.put("Key6", "Item6");
		
		// Get the size of three map elements
	    System.out.println("TreeMap Size : " + tremap.size());

	}

}
