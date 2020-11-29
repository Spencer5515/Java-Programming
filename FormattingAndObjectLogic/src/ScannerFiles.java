
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFiles {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\Users\\spenc\\Documents\\Java txt's\\ReadingFiles.txt";		
		File textFile = new File(fileName); // creates a new file 	
		
		/////////////////////////////////////////////////////////////////////
		
		System.out.println();
		System.out.println("========== Normal File Reading ==========");
		// main throws FileNotFoundException for this object
		Scanner scanIn = new Scanner(textFile); // Scanner opened
		
		int val = scanIn.nextInt(); // reads int value at top of file
		System.out.println("Read Value: " + val);
		
		while(scanIn.hasNextLine()) { // while there is another line to be read
			String line1 = scanIn.nextLine(); // scans in next line  
			
			System.out.println(line1);
		} // while
		
		scanIn.close(); // closes Scanner / underlying file in the system
		
		/////////////////////////////////////////////////////////////////////
		
		// main throws FileNotFoundException for this object
		Scanner scanIn2 = new Scanner(textFile); // Scanner opened
		
		System.out.println();
		System.out.println("========== Limited Loop Reading ==========");
		System.out.println("Reading next 5 lines with a For-loop...\n");
		
		for (int i = 0; i < val; i++) {
			String line2 = scanIn2.nextLine();
			System.out.println(line2);
		} // for loop
		
		scanIn2.close(); // closes Scanner / underlying file in the system
		
	} // main
}
