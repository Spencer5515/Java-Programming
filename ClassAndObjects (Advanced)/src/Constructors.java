class Machine {
	private String name;
	private int code;
	
	public Machine() { // no parameters, acts first
		System.out.println("Called Constructor");
		
		setName("Arnie");
	} // constructor
	
	public Machine(String s) { // 2nd constructor with parameter
		System.out.println("Called 2nd Constructor");
		
		setName(s);
	} // constructor 2
	
	public Machine(String s, int i) { // 3rd constructor with parameters
		System.out.println("Called 3rd Constructor");
		
		setName(s);
		setCode(i);
	}
	
	public void setName(String s) { name = s; }
	
	public void setCode(int i) {code = i; }
	
	public String getName() { return name; }
	
	public int getCode() { return code; }
}

public class Constructors {
	
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Machine mach2 = new Machine("Bertie");
		Machine mach3 = new Machine("Chalky", 7);
		
		System.out.println();
		System.out.println("Mach1's name is: " + mach1.getName());
		System.out.println("Mach2's name is: " + mach2.getName());
		System.out.println("Mach3's name and code are: " + mach3.getName() + 
				" // Code: " + mach3.getCode());
	} // main
}
