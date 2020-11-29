import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {

	public static void main(String[] args) {
		File tempFile = new File("test.txt");

		try {
			FileReader fr = new FileReader(tempFile);
			
			System.out.println("Continuing...");
		} // try
		catch (FileNotFoundException e) {
			System.out.println("ERROR: File Not Found: " + tempFile.toString());
		} // catch
		
		System.out.println("Finished");
		
	} // main
}
