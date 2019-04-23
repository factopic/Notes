package Collections.comparator;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String firstName ;
	private String lastName ;
	private int age;
	
	public Employee( int id, String fName, String lName, int age)
	{
			this.id = id;
			this.firstName = fName;
			this.lastName = lName;
			this.age = age;
	}
	
    // Setters and Getters
	
	
	@Override
	public String toString()
	{
		return "Employee - "+ id + " - "+firstName+" - "+lastName+" - "+age;
	}
	

	@Override
	public int compareTo(Employee e) {
		
		return this.age - e.age ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
