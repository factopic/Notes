package Pattern;



public class Pattern1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(" ** Printing Pattern ** ");
		int n =5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			int m= 1;
			for(int k=0; k<=n-i; k++)
			{
				System.out.print(m++);   //System.out.print(m++ +" ");
				
			}
			
			
			System.out.println(" ");
		}
	}
}



/*
 * 
 * 
Space providing 

System.out.print(m++); 
   ** Printing Pattern ** 
12345 
 1234 
  123 
   12 
    1 


System.out.print(m++ +" ");
 ** Printing Pattern ** 
1 2 3 4 5  
 1 2 3 4  
  1 2 3  
   1 2  
    1  


*/
