package Collections.comparable;

import java.util.Comparator;

import Collections.comparator.Employee;



public class FirstNameSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getFirstName().compareTo(o2.getFirstName() );	
	}

		
}
