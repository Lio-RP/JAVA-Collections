package javaCollections.map.hashTable;

import java.util.*;

public class CheckKeyValueEXist {

	public static void main(String[] args) {
		
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
		
		/* Checking Key existence using containsKey() method.
		    * boolean containsKey(Object key) method returns true if the 
		    * Hashtable contains the key, otherwise it returns false.
		    */
		
		System.out.println("is key 'key1' exists in the hashtable? : " + hashTable.containsKey("Key1"));
		System.out.println("is key 'key12' exists in the hashtable? : " + hashTable.containsKey("Key12"));
		
		
		/* Checking Value existence using containsValue() method.
		    * boolean containsKey(Object key) method Returns true 
		    * if this Hashtable maps one or more keys to this value..
		    */
		System.out.println("is value 'Liban' exists in the hashtable? : " + hashTable.containsValue("Liban"));
		System.out.println("is value 'Basro' exists in the hashtable? : " + hashTable.containsValue("Basro"));
	}

}
