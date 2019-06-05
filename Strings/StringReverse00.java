package Strings;

public class StringReverse00 
{
	static String st  =  "Philantrophie";
	static String re = "";
	static char ch[] =  st.toCharArray();
	
	
	public static void main(String[] args) 
	{
		reverse3(st);				// Single String implementation
		reverse4(st);				//String Reverse using StringBuilder
	}
	
	
	
	//implementation
	static void reverse3(String st)		  				
	{
		for(int i=st.length()-1; i>=0;  i--)
		{
			re = re+ ch[i];
		}
		System.out.println( "Reverse3 :"+ re );
	}
	
	
	//String Reverse using StringBuilder
	static void reverse4(String st)					
	{
		StringBuilder sb =  new StringBuilder(st);
		sb.reverse();
		System.out.println(   "Reverse4 :"+ sb.toString() );
	}
}
