package Collections.comparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.jmx.Agent;

import Collections.comparator.Employee;

public class ComparableEx01 
{
	public static void main (String[] args)
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
		
		
		Collections.sort(emp , new FirstNameSorter());
		// Sorted by firstName
        System.out.println(emp);
		
		Collections.sort(emp, new AgeSorter() );		
				
	}
}
