package Calcu;

public class GcdEx01
{
		static void gcd( int a , int b)
		{
			while ( a != b)
			{
				if( a > b)
					a = a-b;			//System.out.println(a+" "+b);
				
				else 
					b= b-a;             //System.out.println(a+" "+b);
				
			}
			System.out.println( "GCD with subtraction "+b);
			
		}
		
		
		static void gcd1(int a , int b)
		{
			for ( int i=1; i<=a && 1<=b; i++ )                                   //java.lang.ArithmeticException: / by zero   if i=0
			{
				if( a%i ==0 && b%i==0 )
				{
					System.out.println( "GCD with reminder "+i);
					System.out.printf("GCD of %d and %d is: %d", a, b, i);
					System.out.println();
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		public static void main(String[] args)
		{
			int a , b = 0;
			a = 55;
			b = 121;
			gcd( 121 , 55);
			
			gcd1( 55 , 121);
		}
}






































/*
 * 
 
  121-55=66
  66-55=11
  
  55-11=44
  44-11=33
  33-11=22
  22-11=11
  Ans
  
 * 
 * */

