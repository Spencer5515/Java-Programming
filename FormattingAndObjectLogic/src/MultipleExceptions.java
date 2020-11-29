import java.io.IOException;
import java.text.ParseException;

class Test {
	public void run() throws IOException, ParseException  {
		// throw new IOException(); // exception with user I/O
		
		throw new ParseException("ERROR: command list error.", 2); // exceptionw with parsing
	}
}

public class MultipleExceptions {

	public static void main(String[] args) {
		Test test = new Test();
		
		// Child Exceptions should be caught first: Polymorphism
		
		///// try / catches /////
		try {
			test.run();
		} 
		catch (IOException e) {
			System.out.println("ERROR: User I/O Exception Found");
		} 
		catch (ParseException e) {
			System.out.println("ERROR: Parsing Exception Found");
		}
		
		
		///// multi-try/catches /////
		try {
			test.run();
		} 
		catch (IOException | ParseException e) {
			System.out.println("ERROR: Parsing or User I/O Exception Found");
		}
		
		
		///// Catches any kind of exception /////
		try {
			test.run();
		}
		catch(Exception e) {
			System.out.println("ERROR: An Exception Was Found");
		}
		
	} // main
}
