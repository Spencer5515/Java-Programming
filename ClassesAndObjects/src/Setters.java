class Frog {
	private String name; // need setters and getters for access
	private int age; // forces encapsulation
	
	// setters
	public void setName(String n) { name = n; }
	
	public void setAge(int a) { age = a; }
	
	// getters
	public String getName() { return name; }
	
	public int getAge() { return age; }
}

public class Setters {
	
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
		frog1.setName("Bertie");
		frog1.setAge(2);
		
		System.out.println("Frog1's name is: " + frog1.getName());
		System.out.println("Frog1's age is: " + frog1.getAge());
	} // main
}
