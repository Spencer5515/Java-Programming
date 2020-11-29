import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderOld {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\spenc\\Desktop\\Java txt's\\FileReaderTest.txt";		
		File textFile = new File(fileName); // creates a new file 	
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(textFile);
			
			// allows for "Buffering"
			br = new BufferedReader(fr); // processes line by line 
			
			String line;
			
			while((line = br.readLine()) != null) { // reads lines from file 1 by 1
				System.out.println(line); // prints each read line
			} // while
		} 
		catch (FileNotFoundException e) {
			System.out.println("ERROR: " + textFile.toString() + " Not Found");
		} 
		catch (IOException e) {
			System.out.println("ERROR: Unable to Read " + textFile.toString());
		}
		
		finally {
			try {
				br.close(); // closes BufferedReader then FileReader
			} 
			catch (IOException e) {
				System.out.println("ERROR: Unabled to Close Opened File");
			} 
			catch (NullPointerException ex) {
				// File was probably never opened
			}
		} // finally
		
	} // main
}
