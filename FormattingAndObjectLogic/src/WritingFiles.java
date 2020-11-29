import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\spenc\\Desktop\\Java txt's\\WritingTest.txt";		
		File textFile = new File(fileName); // creates a new file 	
		
		// automatically closes file
		try (BufferedWriter br = new BufferedWriter(new FileWriter(textFile))) {
			br.write("This is line one\n");
			br.write("This is line two\n\n");
			br.write("Last Line");
		}
		catch (IOException e) {
			System.out.println("ERROR: Unable to Read File");
		}
	} // main
}
