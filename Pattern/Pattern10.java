package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		System.out.println("Print Pattern10 ");
		int rows =5;
		
		for( int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int k=1; k<=i; k++)
			{
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=rows-i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
