package javaCollection.arrayList;

import java.util.*;

public class OverrideToString
{
	/**
	 * This Program Demonstrates How to override toString method for ArrayList in Java
	 * 
	 */
	public static void main(String[] args)
	{
		ArrayList<Employee> em = new ArrayList<Employee>();
		
		//Adding employee in the list
		em.add(new Employee(101, "Liban Abdullahi", 25, 2500.0));
		em.add(new Employee(102, "Basro Abdulle", 20, 25550.0));
		em.add(new Employee(103, "Liban Roble", 22, 200.0));
		em.add(new Employee(104, "Mohamed Hazzan", 21, 2456.0));
		em.add(new Employee(105, "Cllahi Cali", 23, 345.0));
		
		//Displaying the employees list;
		for(Employee e: em)
			System.out.println(e);
	}

}

class Employee
{
	private String name;
	private int rollno;
	private int age;
	private double salary;
	
	public Employee(int rollno, String name, int age, double salary)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollno;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "[rollno=" + rollno + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
