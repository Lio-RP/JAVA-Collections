package javaCollections.map.hashTable;

import java.util.*;

public class IteratorHashTable {

	public static void main(String[] args) {
		
		String str;
		
		// Creating a Hashtable
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
				
		/* Adding key-value pairs to Hashtable
	     * public V put(K key, V value): Maps the specified key to the 
	     * specified value in this hashtable. Neither the key nor the 
	     * value can be null. The value can be retrieved by calling the 
	     * get method with a key that is equal to the original key.
	     */
		//Adding Elements
		hashTable.put("Key1", "Liban");
		hashTable.put("Key2", "Abdullahi");
		hashTable.put("Key3", "Mohamed");
		hashTable.put("Key6", "Roble");
		hashTable.put("Key5", "Warfaa");
		hashTable.put("Key4", "Faarax");
		
		System.out.println("HashTable Contains:");
		
		/* public Set<K> keySet(): Returns a Set view of the keys 
	     * contained in this map. The set is backed by the map, 
	     * so changes to the map are reflected in the set, and 
	     * vice-versa.
	     */
		
		Set<String> set = hashTable.keySet();
		
		//Obtain iterator over set entries
		Iterator<String> iter = set.iterator();
		
		//Display contents
		while(iter.hasNext())
		{
			//Getting key
			str = iter.next();
			
			/* public V get(Object key): Returns the value to which 
		        * the specified key is mapped, or null if this map 
		        * contains no mapping for the key.
		        */
			System.out.println(str + ": " + hashTable.get(str));
			
		}
		
	}

}
