package javaCollections.map.hashMap;

import java.util.*;

public class SynchronizedHashMap {

	/**
	 * This program demonsatrates How to synchronize HashMap in Java with example
	 * HashMap is a non-synchronized collection class. If we need to perform thread-safe operations on it 
	 * then we must need to synchronize it explicitly.
	 * we are using Collections.synchronizedMap(hashmap)  it returns a thread-safe map backed up by the specified HashMap.
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(12, "Liban");
		hmap.put(23, "Abdullahi");
		hmap.put(3, "Mohamed");
		hmap.put(45, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(65, "Faarax");
		
		Map map = Collections.synchronizedMap(hmap);
		Set set = map.entrySet();
		synchronized(map) {
			Iterator iter = set.iterator();
			while(iter.hasNext())
			{
				Map.Entry ma = (Map.Entry)iter.next();
				System.out.println("Key is: " + ma.getKey() + " & Value is: " + ma.getValue());
			}
		}

	}

}
