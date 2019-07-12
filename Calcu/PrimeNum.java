package Calcu;

import java.util.Scanner;

public class PrimeNum 
{
	private static Scanner sc;


	public static boolean isPrime(int n)
	{
		int i=2;
										//		System.out.println("n/2 "+ n/2);
		while (i<=n/2)
		{
			if(n%i==0)
			{
				break;			//Break exist loop
			}
			else 
			{
				i++;
			}
		}
									//			System.out.println("i "+ i);
		return i>n/2;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method started ");
		sc = new Scanner(System.in);
		
		System.out.println("Enter the interger number");
		int a = sc.nextInt( );
		
		boolean res = isPrime(a);
		if (res)
		{
			System.out.println("Entered Number is Prime !!!");
		}
		else 
		{
			System.out.println("Entered Number is Not Prime !!!");
		}
		System.out.println("Main Method ended ");
		
	}
}
