package abstractClasses;

public class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Starting Camera");
	}

	@Override
	public void doStuff() {
		System.out.println("Checking for SD card");
	}

	@Override
	public void shutDown() {
		System.out.println("Shutting Down Camera");
	}
	
}
