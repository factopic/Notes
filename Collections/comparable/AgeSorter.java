package Collections.comparable;

import java.util.Comparator;
import Collections.comparator.Employee;



public class AgeSorter implements  Comparator<Employee>
{	
		
		public int compare(Employee e1 , Employee e2)
		{
			return e1.getAge()-e2.getAge();
		}


}
