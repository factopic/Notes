package Singleton;

public class Example1 
{
	//Class type variable
	private static Example1 ex;				
	
	// Default Constructor
	private Example1()
	{
		System.out.println("Running Private const "+ getClass());
	}
	
	
	// Static Method used to create a Instance of a class
	public static Example1 getInstance()
	{
		if(ex==null)
		{
			ex= new Example1();
		}
		return ex;
	}
	
	// Non Static Method 
	 void Sample()
	{
		System.out.println("Running Sample Method of class Example1");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method started");
		
		Example1 e =Example1.getInstance();
		System.out.println( "e value---------------"+ e );
		e.Sample();
		
		Example1 e1 =Example1.getInstance();
		System.out.println( "e1 value---------------"+ e1 );
		e1.Sample();
		
		System.out.println( "e==e1 --------------------------------"+ e.equals(e1) );

		
		Example1 e2 =  new Example1();
		System.out.println( "e2 value---------------"+ e2 );
		System.out.println( "e==e2--------------------------------"+ e.equals(e2) );
		System.out.println("Main Method ended");


                Example1 e2 =  new Example1();
		System.out.println( "e2 value---------------"+ e2 );
		System.out.println( "e==e2--------------------------------"+ e.equals(e2) );
		System.out.println("Main Method ended");
	}
	}
}
