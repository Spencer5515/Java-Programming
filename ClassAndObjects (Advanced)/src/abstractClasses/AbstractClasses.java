package abstractClasses;

public class AbstractClasses {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		
		cam1.setId(5);
		cam1.start();
		cam1.doStuff();
		cam1.shutDown();
		
		System.out.println();
		
		Car car1 = new Car();
		car1.setId(4);
		car1.start();
		car1.doStuff();
		car1.shutDown();
		
		// base(abstract) class = only purpose is to be a base class
		//Machine mach1 = new Machine(); 
		
	} // main
}
