class Robot {
	public void speak(String s) {
		System.out.println(s);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height + " ft");
	}
	
	public void move(String direct, double x) {
		System.out.println("Moving " + x + " meters in the " + direct + " direction");
	}
}

public class MethodParameters {

	public static void main(String[] args) {
		Robot sam = new Robot();
		String greeting1 = "Hi im Sam!";
		String greeting2 = "Hello There";
		
		sam.speak(greeting1); 
		sam.jump(7);
		System.out.println();
		sam.move("West", 12.5);
		System.out.println();
		sam.speak(greeting2);
	} // main
}
