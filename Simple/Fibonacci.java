package Simple;

public class Fibonacci {
	
	static int n1=0, n2=1, n3=0 ;
	
	public static void finbonaciWRecu(int count )
	{
		
		while( count > 1)
		{
			n3= n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			count--;
		}
		
	}
	
	
	public static void fibonacciRecu(int count)
	{
	
		
		if(count >1)
		{
			n3= n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			
			fibonacciRecu( count-1);
		}

	}
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		System.out.println("Printing Fibonacci without Recurrsion ");
		
		System.out.print(n1+" "+n2);
		finbonaciWRecu(10);
		
		System.out.println();
		

		System.out.println("Printing Fibonacci with Recurrsion ");
		
		System.out.print(n1+" "+n2);
		fibonacciRecu(10-2);
		
	}
}
