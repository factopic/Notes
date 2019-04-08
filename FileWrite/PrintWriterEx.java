package FileWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PrintWriterEx
{
	public static void main(String[] args) throws IOException
	{
		//Getting the output stream of the file for writing

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		String sDate = dateFormat.format(date);
		
		System.out.println( sDate );
		File file = new File("src\\FileWrite\\Output"+sDate+".txt");
		//File file = new File("src\\FileWrite\\Output.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintWriter pw = new PrintWriter(fos);
		
		//BufferedReader to take the input from the console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter the text :");
		String str = br.readLine();
		
		  //Writing the user input to the file
		pw.write(str);
		pw.flush();
		fos.close();
		pw.close();
		
	}
}
