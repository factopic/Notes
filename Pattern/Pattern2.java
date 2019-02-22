package Pattern;

public class Pattern2 
{
	
	public static void main(String[] args)
	{
		System.out.println(" ** Printing Pattern ** ");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}

/*
 
 ** Printing Pattern ** 
1
12
123
1234
12345


1
22
333
4444
55555




*/