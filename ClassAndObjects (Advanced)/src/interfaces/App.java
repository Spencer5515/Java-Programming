package interfaces;

public class App {

	public static void main(String[] args) {
		// Machine class
		Machine mach1 = new Machine();
		
		mach1.start();
		
		// Person class
		Person person1 = new Person("Stephanie");
		
		person1.greet();
		
		// Info interface
		Info info1 = new Machine(); // gives access to inherited method in Machine
		info1.showInfo(); // only method info1 can access
		
		Info info2 = person1; // points info2 to whatever person1 points to
		
		System.out.println();
		outputInfo(person1); // passes person1 Object into outputInfo
		outputInfo(mach1);
	} // main
	
	private static void outputInfo(Info info) {
		info.showInfo();
	} // temp info method
}
