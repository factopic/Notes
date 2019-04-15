package FileWrite;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx2 {
	
	public static void main(String[] args) throws Exception {
		
		 //Data to write on Console using PrintWriter  
		PrintWriter pw = new PrintWriter(System.out);
		String  str = "Hello Pavan"
				+ "This message is from Java Program"
				+ "How are you!"
				+ "			Thank you....."
				+ "Random"
				;
		pw.write(str);
		pw.flush();  
	    pw.close();
	    
	
	    
	}

}
