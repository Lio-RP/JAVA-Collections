package javaCollection.arrayList;

import java.util.*;

public class SortingArrayListObjectComparator
{
	/**
	 * We generally use Collections.sort() method to sort a simple array list.
	 * However if the ArrayList is of custom object type then in such case 
	 * you have two options for sorting- comparable and comparator interfaces.
	 * 
	 * Since Comparable is implemented by the same class whose objects are sorted so
	 * it binds you with that sorting logic which is ok in most of the cases
	 * but in case you want to have more than way of sorting your class objects
	 * you should use comparators. 
	 * 
	 * Sorting ArrayList<Object> multiple properties with Comparator
	 */
	public static void main(String[] args) 
	{
		ArrayList<Students> students = new ArrayList<Students>();
		
		//filling the array list
		students.add(new Students(101, "Liban", 25));
		students.add(new Students(102, "Basro", 20));
		students.add(new Students(103, "Suhelo", 3));
		students.add(new Students(104, "mohamed", 21));
		students.add(new Students(105, "Zamiin", 23));
		
		
		
		   /*Sorting based on Student Name*/
		Collections.sort(students, Students.stuNameComparator);
		System.out.println("Student Name Sorting:");
		for(Students st: students)
			System.out.println(st);
		
		/* Sorting on Rollno property*/
		Collections.sort(students, Students.stuRoll);
		System.out.println("Student rollno Sorting:");
		for(Students st: students)
			System.out.println(st);
	}

}

//We are overriding compare method of Comparator for sorting.
class Students
{
	private String name;
	private int rollNumber;
	private int age;
	
	public Students(int rollNumber, String name, int age)
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

	/*Comparator for sorting the list by Student Name*/
	public static Comparator<Students> stuNameComparator = new Comparator<Students>()
			{
				public int compare(Students s1, Students s2) {
					
					String studentName1 = s1.getName().toUpperCase();
					String studentName2 = s2.getName().toUpperCase();
					
					  //ascending order
					return studentName1.compareTo(studentName2);
					
					//descending order
					//return StudentName2.compareTo(StudentName1);
				}
			};
			
	/*Comparator for sorting the list by roll no*/
	public static Comparator<Students> stuRoll = new Comparator<Students>() {
		public int compare(Students s1, Students s2)
		{
			int rollNo1 = s1.getRollNumber();
			int rollNo2 = s2.getRollNumber();
			
			/*For ascending order*/
			return rollNo1-rollNo2;
			
			   /*For descending order*/
			   //rollno2-rollno1;
		}
	};
	
	@Override
	public String toString()
	{
		return "[rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}
}