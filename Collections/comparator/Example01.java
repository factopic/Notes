package collection.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Test case for Comparable Interface compare() implemented in Employee

public class Example01 
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(1, "Hiral", "Singh", 25);
		Employee e2 = new Employee(2, "Krunal", "Kaur", 26);
		Employee e3 = new Employee(5, "Maduri", "Gurugram", 24);
		Employee e4 = new Employee(4, "April", "Marry", 21);
	
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		//UnSorted List
		
		System.out.println(emp);
		
		Collections.sort(emp);
		
		//Sorting based on Age
		System.out.println(emp);
		
		
	}

}
