package FileReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader2 {
	
	
	
	public static void main(String[] args) throws IOException 
	{
	
		String csvFile = "src\\FileReader\\SampleCSVFile.csv";
		
		Scanner scanner = new Scanner(new File(csvFile));
		scanner.useDelimiter("\\n");
		String st= null;
		ArrayList<ArrayList<String>> record = new ArrayList<ArrayList<String>>();
		
		while( scanner.hasNext() )
		{
			st = scanner.next();
			record.add( splitCell( st ) ); 	
		}
				

		findDuplicates( record);
		findNull(record);
		
		scanner.close();
		
		
		 
	     
	}
	
	
	
	public static ArrayList<String> splitCell(String st )
	{
		
		String delimiter = ",";
		String[] srr = st.split(delimiter);
		ArrayList<String>  arr = new ArrayList<String>();
		
		
		for(int i=0; i<=srr.length-1; i++)
		{
			arr.add(srr[i]);
		}
	
		for(String s : arr)
		{
			System.out.print(s+ " ");
		}
		System.out.println();
		
		return arr;
	}
	
	
	
	public static void findDuplicates( ArrayList<ArrayList<String>> record )
	{
	
		System.out.println( " Removing Duplicates");	
		Object st = null;
		
		for(int i=0; i<=record.size()-1; i++)
		{
			
			 
			
			for(int j=0; j<=record.get(i).size()-1; j++)
			{
				int i2 = i;
				int k = j;
				//System.out.println(j+"/");
				st = record.get(i).get(j) ;
				
				
				while( i2<=record.size()-1 )
				{				
					if( st.equals(record.get(i2).get(k))  )
					{						
						if(i2 != i )
						{
							System.out.println( i+":"+j +  "=" +  i2+":"+k );			
							record.remove(i2);
						}											
						//System.out.println( record.get(i).get(j) + " comparing with "  +record.get(i2).get(k) );
						
						//System.out.println(  st.equals(record.get(i2).get(k)) + " "+ i2 +" "+j);												
					}									
					i2++;
				}
			}
			System.out.println( );	
		}
		
	
		for(ArrayList<?> s  : record)
		{
			System.out.println(s);
		}
		
		
	}
	
	
	
	public static void findNull( ArrayList<ArrayList<String>> record )
	{
		
		System.out.println( "  Finding Null");		
		Object st = null;
		int count = 0;
		for(int i=0; i<=record.size()-1; i++)
		{
	
			for(int j=0; j<=record.get(i).size()-1; j++)
			{ 
				System.out.println( record.get(i).get(j)  +" "+ record.get(i).get(j).equals(null)  ); 
						
			}
			System.out.println( );	
		}
		
	/*
		for(ArrayList<?> s  : record)
		{
			System.out.println(s);
		}
		*/

	}
	
	

}



