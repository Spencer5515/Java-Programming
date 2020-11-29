package inheritance;

public class Car extends Machine {
	// Car inherits from Machine (Car is a child class)
	
	@Override // checks for override
	public void start() {
		// parent method override
		System.out.println("Car has started!");
	}
	
	@Override // checks for override
	public void stop() {
		// parent method override
		System.out.println("Car has stopped");
	}
	
	// new child classes
	public void wipers() {
		System.out.println("Wipers = ON");
	}
	
	public void wipersOFF() {
		System.out.println("Wipers = OFF");
		
	}
	
	public void showInfo() { 
		System.out.println("Car name: '" + name + "'");
	}
	
}
