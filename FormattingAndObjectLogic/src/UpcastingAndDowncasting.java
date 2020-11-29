
class Machine {
	
	public void start() {
		System.out.println("Machine has started!\n");
	}
} // Machine

class Camera extends Machine {
	
	@Override
	public void start() {
		System.out.println("Camera has Started!");
	}
	
	public void snap() {
		System.out.println("Photo has been taken");
	} 
} // Camera

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		cam1.start();
		cam1.snap();
		System.out.println();
		
		System.out.println("*UPCASTING*");
		// Upcasting
		Machine mach2 = cam1; // makes mach2 refer to cam1 Object
				// upcasted because it goes "UP" from child -> parent Object
		mach2.start();
		// error: mach2.snap(); // variable only knows methods in Machine class
				// only call Camera's start() because its overridden
		
		System.out.println("\n*DOWNCASTING*");
		// Downcasting (Can ONLY be done this way)
		Machine mach3 = new Camera(); // Refers to Camera which 'does' have snap();
		Camera cam2 = (Camera)mach3; // cam2 now refers to mach3
				// downcasted because it goes "DOWN" from parent -> child Object
		cam2.start();
		cam2.snap();
		
		/* 
		 * -- Runtime Error --
		Machine mach4 = new Machine();
		Camera cam3 = (Camera)mach4;
		*/
		
	} // main
}
