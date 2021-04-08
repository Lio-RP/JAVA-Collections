package javaCollections.map.hashTable;

import java.util.*;
import java.util.Enumeration;

public class HashTableExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Enumeration names;
		String key;
		
		// Creating a Hashtable
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		//Adding Elements
		hashTable.put("Key1", "Liban");
		hashTable.put("Key2", "Abdullahi");
		hashTable.put("Key3", "Mohamed");
		hashTable.put("Key6", "Roble");
		hashTable.put("Key5", "Warfaa");
		hashTable.put("Key4", "Faarax");
		
		// Adding Key and Value pairs to Hashtable
		
		names = hashTable.keys();
		while(names.hasMoreElements())
		{
			key = (String)names.nextElement();
			System.out.println(key + ": " + hashTable.get(key));
		}

	}

}
