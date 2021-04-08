package javaCollections.map.hashMap;

import java.util.*;

public class GetValue {

	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(1, "Liban");
		hmap.put(2, "abdullahi");
		hmap.put(3, "mohamed");
		hmap.put(4, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(6, "Faarax");
		
		// Getting values from HashMap
	     String val=hmap.get(4);
	     System.out.println("The Value mapped to Key 4 is:"+ val);

	}

}
