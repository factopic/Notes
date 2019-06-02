package Strings;
import java.util.Arrays;
import java.util.Scanner;


//StringBuilder
public class StringReverse 
{ 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String / Sentence");
		String st = sc.nextLine();
		
		
		reverse2(st);
		

	}
	
	
	
	
	static void reverse2(String st)
	{
		String words[] = st.split(" "); 				//By the help of split("\\s") method, we can get all words in an array. 
	//	System.out.println(  Arrays.toString(words) );
		
		String reverseWord="";
		
		for(String w: words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();								//By using reverse() method of StringBuilder class, we can reverse given string. 
			reverseWord = reverseWord + sb.toString()+" ";
		}
		System.out.println( reverseWord );
	}
	
	
	
}






//Bengaluru is city in karnataka

/*
We can reverse each word of a string by the help of reverse(), split() and substring() methods. 
To get the first character, we can use substring() or charAt() method.
 
 */
// pavan kumar is a honest