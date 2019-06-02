package Strings;

public class Palindrome
{
	public static void main(String[] args) 
	{
		String st1 = "nitin";
		StringBuilder sb = new StringBuilder(st1);
		sb.reverse();
		String st2 = sb.toString();
		
		System.out.println( st1 == st2);
		
		checkPalindrome( st1 , st2 ) ;
	
		
	}
	
	static void checkPalindrome(String st1 , String st2 )
	{
		if ( st1 == st2 )
			System.out.println( " It is a Palindrome ");
		else 
			System.out.println( " It is not a Palindrome ");
	}
}
