package Pattern;

public class Pattern7 {
	
	public static void main(String[] args)
	{
		System.out.println("Printing Pattern7 ");
		System.out.println();
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}


/*

Printing Pattern7 

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 



 * */
