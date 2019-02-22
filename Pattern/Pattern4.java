package Pattern;

public class Pattern4 
{
	public static void main(String[] args)
	{
		System.out.println( "** Printing Pattern **");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				 System.out.print(k+" ");   //  System.out.print(k+" ");
			}
			System.out.println( );
		}
	}
}



/*
 
Space providing 
 
 System.out.print(k);
 
 ** Printing Pattern **
    1
   12
  123
 1234
12345

  System.out.print(k+" ");
 
 ** Printing Pattern **
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 
 */

