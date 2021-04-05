package javaCollection.arrayList;

import java.util.*;

public class SortingArrayListObjectComparable
{
	/**
	 * We generally use Collections.sort() method to sort a simple array list.
	 * However if the ArrayList is of custom object type then in such case 
	 * you have two options for sorting- comparable and comparator interfaces. 
	 * 
	 * Sorting of ArrayList<Object> with Comparable
	 * Let’s say we need to sort the ArrayList<Student>
	 * based on the student Age property. 
	 * This is how it can be done – First implement Comparable interface 
	 * and then Override the compareTo method.
	 */

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<Student>();
		
		//filling the array list
		students.add(new Student(101, "Liban", 25));
		students.add(new Student(102, "Basro", 20));
		students.add(new Student(103, "Suhelo", 3));
		students.add(new Student(104, "mohamed", 21));
		students.add(new Student(105, "Zamiin", 23));
		
		//Sorting
		Collections.sort(students);
		
		for(Student st: students)
			System.out.println(st);
		
	}

}

@SuppressWarnings("rawtypes")
class Student implements Comparable
{
	private String name;
	private int rollNumber;
	private int age;
	
	public Student(int rollNumber, String name, int age)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public int compareTo(Object comparestudent)
	{
		int compareAge = ((Student)comparestudent).getAge();
		/* For Ascending order*/
		return this.age-compareAge;
		
		/* For Descending order do like this */
        //return compareAge-this.age;

	}
	
	@Override
	public String toString()
	{
		return "[rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}
}
