package Calcu;

import java.util.Scanner;

public class EvenOrOdd 
{
	
	
	
//---------------------------------------------------------------------------------------------------------------------
	
	
	public static boolean evenOrOdd1(int n)	// checking eve or odd using modulus operator
	{

		if(n % 2 == 0)
			
			return true; 		// if condition is true then return statement is executed and exit from the method
			return false;
	}
	
	
	
//---------------------------------------------------------------------------------------------------------------------
	
	
	public static boolean evenOrOdd2(int n)	// checking eve or odd with out using modulus operator
	{
		if( (n/2)*2 == n)
			return true; 		// if condition is true then return statement is executed and exit from the method
			return false;
	}
	
//---------------------------------------------------------------------------------------------------------------------
	
	public static void  evenOrOdd3(int n)	// checking eve or odd with out using equals operator
	{
		String st[] = { "even" , "odd"};
			System.out.println("Enter Number is "+ st[n%2] + "( evenOrOdd3 )"); 		// if condition is true then return statement is executed and exit from the method
			
	}
	
	
//---------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
	public static void main (String args[]) throws Exception
	{
		System.out.println("Main Method Started ");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Natural Number (>=0) ");
		int a = sc.nextInt();
		if (a<=0)
		{
			System.out.println("Enter Number is not Natural Number. Pls try again ");
		}
		else
		{
			boolean res1 = evenOrOdd1(a);
			if(res1)
			System.out.println("Enter the Natural Number is  even  ( evenOrOdd1 ) ");
			else
			System.out.println("Enter the Natural Number is  odd ( evenOrOdd1 ) ");
			
			
			
			System.out.println("------------------------------------------------------------------------ ");
			
			
			boolean res2 = evenOrOdd2(a);
			if(res2)
			System.out.println("Enter the Natural Number is  even ( evenOrOdd2 ) ");
			else
			System.out.println("Enter the Natural Number is  odd ( evenOrOdd2 ) ");
			
			
			
			System.out.println("--------------------------------------------------------------------------- ");
			
			evenOrOdd3(a);
			
			System.out.println("--------------------------------------------------------------------------- ");
			
		}

		System.out.println("Main Method Ended ");
	}
}
