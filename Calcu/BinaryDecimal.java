package Calcu;

import java.util.Scanner;

public class BinaryDecimal 
{
	public static int bintodec(int n)
	{
		int sum = 0, c = 0, r;
		while(n>0)
		{
			r=n%10;
			sum = sum + r * pow(2,c);
			n=n/10;
			c++;
		}
		return sum;
	}
	
	public static int pow (int n , int p)
	{
		int pw =1;
		while (p>0)
		{
			pw= pw*n;
			p--;
		}
		return pw;
	}
	
	public static void main(String args[])
	{
		System.out.println("Main Method Started");
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the Binary Number ");
		int a = se.nextInt();
		
		int b = bintodec(a);
		System.out.println("decimal value "+ b);
		
		System.out.println("Main Method Ended");
	}
}



/*

2^2 = 4
2^3 = 8
2^5 = 32
2^6 = 64
2^7 = 128




*/


