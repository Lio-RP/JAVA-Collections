package javaCollections.map.hashMap;

import java.util.*;
import java.io.*;

public class SerializeHashMap {

	/**
	 * This program demonstrates How to serialize HashMap
	 * How to write HashMap object and it’s content into a file
	 * Serialization: It is a process of writing an Object into file along with its attributes and content. 
	 * It internally converts the object in stream of bytes.
	 */
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
		
		try {
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			System.out.println("Serialized HashMap data is saved in hashmap.ser");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
