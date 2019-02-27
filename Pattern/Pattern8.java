package Pattern;

public class Pattern8 {
	
	 public static void main(String[] args) {
		
		 
		 System.out.println("Printing Pattern9");
			System.out.println();
			
			int rows = 5;
			for(int i=1; i<=rows; i++)
			{
				int temp = i;
				for(int j=i; j>=1; j--)
				{
					System.out.print(temp+" ");
					temp = temp + rows;
				}
				System.out.println();
			}
			
			
	}

}
