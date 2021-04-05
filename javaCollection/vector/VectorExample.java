package javaCollection.vector;

import java.util.*;

public class VectorExample 
{
	/**
	 * this program demonstrates Vector
	 * Three ways to create vector class object:
	 * 
	 * Method 1:
	 * Vector vec = new Vector();
	 * It creates an empty Vector with the default initial capacity of 10. 
	 * It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. 
	 * Note: By default vector doubles its size. i.e. In this case the Vector size would remain 10 till 10 insertions 
	 * and once we try to insert the 11th element It would become 20 (double of default capacity 10).
	 * 
	 * method 2:
	 * Syntax: Vector object= new Vector(int initialCapacity)
	 * Vector vec = new Vector(3); It will create a Vector of initial capacity of 3.
	 * 
	 * method 3:
	 * Syntax: Vector object= new vector(int initialcapacity, capacityIncrement)
	 * Vector vec= new Vector(4, 6)
	 * Here we have provided two arguments. The initial capacity is 4 and capacityIncrement is 6. 
	 * It means upon insertion of 5th element the size would be 10 (4+6) and on 11th insertion it would be 16(10+6).
	 * 
	 */
	public static void main(String[] args)
	{
		/* Vector of initial capacity(size) of 2 */
		Vector<String> vec = new Vector<String>(4);
		
		 /* Adding elements to a vector*/
		vec.addElement("Liban");
		vec.addElement("Abdullahi");
		vec.addElement("Mohamed");
		vec.addElement("Roble");
		
		 /* check size and capacityIncrement*/
		System.out.println("Size is: " + vec.size());
		System.out.println("Defoult Capacity incerement is: " + vec.capacity());
		
		vec.addElement("Warfaa");
		vec.addElement("Faarax");
		vec.addElement("Cumar");
		
		/*size and capacityIncrement after two insertions*/
		System.out.println("Size after adding element is: " + vec.size());
		System.out.println("Capacity after incerement is: " + vec.capacity());
		
		/*Display Vector elements*/
		Enumeration<String> en = vec.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
