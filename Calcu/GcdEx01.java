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
			System.out.println(b);
		}
		
		public static void main(String[] args)
		{
			int a , b = 0;
			a = 55;
			b = 121;
			gcd( 121 , 55);
			
			gcd( 55 , 121);
		}
}
