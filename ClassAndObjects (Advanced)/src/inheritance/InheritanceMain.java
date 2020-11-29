package inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		// Machine Object (Parent)
		Machine mach1 = new Machine();
		
		mach1.start(); 
		mach1.stop();
		System.out.println();
		
		// Car Object (Child)
		Car car1 = new Car();
		
		car1.start(); // method override
		car1.wipers(); 
		car1.wipersOFF();
		car1.stop(); // method override
		
		System.out.println();
		car1.showInfo(); // calls method using protected variable
	} // main
}
