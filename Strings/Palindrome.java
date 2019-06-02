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
		
		isPalindrome( st1 , st2 ) ;
	
		
	}
	
	static void isPalindrome(String st1 , String st2 )
	{
		if ( st1.equals(st2) )
			System.out.println( " It is a Palindrome ");
		else 
			System.out.println( " It is not a Palindrome ");
	}
}
