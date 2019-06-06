package Strings;

import java.util.Scanner;

public class StringReverseImp 
{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String / Sentence");
		String st = sc.nextLine();
		
		reverse1(st);
	}
	
	
	static void reverse1(String st)
	{
		String reverse = ""; 
		System.out.println( st.length()+ " / " +st.charAt(6) );
		
		char[] ch = st.toCharArray();
		
		
		for( int i=0; i<=ch.length-1 ; i++)
		{
			
			if( ch[i]==' ' )
			{	
			    int j = i;
			    while( i!=0 || ch[j]==' ' )
			    {
			    	reverse = reverse + ch[j];
			    	j--;
			    }
				
				
			}
			else
				System.out.println( reverse);
		}
		
	}
	
	
	
}
