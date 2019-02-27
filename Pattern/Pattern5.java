package Pattern;

public class Pattern5 {
	
	public static void main(String[] args)
	{
		
		int rows = 5;

        System.out.println(" Printing the Pattern5 ");
        System.out.println();
        
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            int temp = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(temp + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }
    
		
		
	}
	
	

}


/*
 
 
 Printing the Pattern5 

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 




 */


/