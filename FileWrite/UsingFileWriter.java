package FileWrite;

import java.io.FileWriter;


public class UsingFileWriter {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("src\\FileWrite\\Output.txt" , true);
		String  str = "Hello Pavan"
				+ "This message is from Java Program"
				+ "How are you!"
				+ "				Thank you....."
				+ "Random"
				;
						
		fw.write(str);
		fw.close();
                fw.close();
	}
}
