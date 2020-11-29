package passByValue;

public class App {

	public static void main(String[] args) {
		App app = new App(); // can call non-static methods of this class
		
		int val = 7;
		System.out.println("1. Value is: " + val);
		
		app.show(val); // passing by value
		
		System.out.println("4. Value is: " + val);
	} // main
	
	public void show(int val) {
		System.out.println("2. Value is: " + val);
		
		val = 8;
		
		System.out.println("3. Value is: " + val);
	} // show method
}
