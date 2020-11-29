import inheritance.Car;
import inheritance.Machine; // gives access to Machine.java in 'inheritance' package

// import inheritance.*; // imports everything from 'inheritance package

public class Packages {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		
		Car car1 = new Car();
	} // main
}
