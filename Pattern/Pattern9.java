package Pattern;

public class Pattern9 {

	public static void main(String [] args)
	{
		System.out.println("Printing Pattern9");
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*
 


Printing Pattern9

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 



 */
