package inheritance;

public class Machine {
	protected String name = "Machine Type 1";

	// parent methods
	public void start() {
		System.out.println("Machine has started!");
	}
	
	public void stop() {
		System.out.println("Machine has stopped!");
	}
}
