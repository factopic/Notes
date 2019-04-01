package FileReader;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader1 
{
	//Delimiter used in CSV file
	final static String  DELIMITER = ",";
	
	
	public static void main(String[] args) 
	{
		// file which need to be parse
		String fileToParse = "src\\FileReader\\SampleCSVFile.csv";
		BufferedReader fileReader = null;
		
		
		ArrayList<String> records = new ArrayList<String>();

		try 
		{
			String line = " ";
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(fileToParse));
			
			//Read a file line by line
			while (  (line = fileReader.readLine())  != null)
			{
				//Get all tokens available in line
				String[] tokens = line.split(DELIMITER);
				
				
				for(String token : tokens)
				{
					System.out.println(token);
				}
				 

			
			
				System.out.println();
 			}
			
		}
		  
	
	

		
		catch (Exception e) 
		{
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fileReader.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            
        }
		
		
	
            
	}
	
	private static ArrayList<String> getRecordFromLine(String line) {
	    ArrayList<String> values = new ArrayList<String>();
	    try (Scanner rowScanner = new Scanner(line)) {
	        rowScanner.useDelimiter(DELIMITER);
	        while (rowScanner.hasNext()) {
	            values.add(rowScanner.next());
	        }
	    }
	    return values;
	}
}
