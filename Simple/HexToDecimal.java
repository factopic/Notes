package Calcu;

import java.util.Scanner;

public class HexToDecimal 
{
	public static int  hexToDec(String st)
	{	
		int i = st.length()-1  ,  sum =0 , c=0 ;
		
		while(i>=0)
		{
			char ch = st.charAt(i);
			
			if(ch >= 'A' && ch<= 'F')
			{
				sum = sum + (ch-55) * pow(16,c);
			}
			else if (ch >='a' && ch<='f') 
			{
				sum= sum + (ch-87) * pow(16,c);
			}
			
			else
			{
				sum = sum +(ch-48) * pow(16,c);
				
			}
			
			c++;
			i--;
		}
		return sum;
	}
	
	
	public static int pow(int n , int p)
	{
		int pw=1;
		while(p>0)
		{
			pw= pw*n;
			p--;
		}
		return pw;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Main Method Started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa Decimal Number (1-9 , A-F , a-f) ");
		String st = sc.nextLine();
		
		int res = hexToDec(st);
		System.out.println("Decimal equivalent of " + st + " is " + res);
		
		System.out.println("Main Method Ended ");
	}
			
}








/*


Main Method Started 
Enter Hexa Decimal Number (1-9 , A-F , a-f) 
100
Decimal equivalent of 100 is 256
Main Method Ended 

1*16^2  + 0*16^1 + 0*16^0   = 256  

*/