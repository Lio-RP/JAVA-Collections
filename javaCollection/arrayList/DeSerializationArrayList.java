package javaCollection.arrayList;

import java.util.ArrayList;
import java.io.*;

public class DeSerializationArrayList
{
	/**
	 * This Program Demonstrates  How to De-serialize ArrayList in java
	 *In this class we are retrieving the stream of bytes from myfile which we have stored
	 *We are type casting the returned object to ArrayList and displaying 
	 *the elements of ArrayList. Observe the output: We are getting the same elements 
	 *which we have added to the ArrayList before the serialization.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList<String> arraylist = new ArrayList<String>();
		
		try {
			FileInputStream fis = new FileInputStream("myfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist =  (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException io){
			io.printStackTrace();
			return;
		}catch(ClassNotFoundException cl) {
			System.out.println("Class Not found");
			cl.printStackTrace();
			return;
		}
		
		for(String list: arraylist)
		{
			System.out.println(list);
		}
	}

}
