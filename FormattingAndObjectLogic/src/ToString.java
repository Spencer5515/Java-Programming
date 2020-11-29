class Frog {
	private String name;
	private int id;
	
	public Frog(String s, int i) {
		name = s;
		id = i;
	} // constructor
	
	public String toString() { // custom toString method
		StringBuilder sb = new StringBuilder();
		
		sb.append(id).append("; ").append(name);
		
		return sb.toString(); // sends to this.toString()
		
		//return String.format("%4d: %s", id, name); performs same function
		// uses String format && printf()
	}
}

public class ToString {

	public static void main(String[] args) {
		Frog frog1 = new Frog("Freddie ", 7);
		Frog frog2 = new Frog("Roger ", 5);
		
		System.out.println(frog1);
		System.out.println(frog2);
	} // main
}
