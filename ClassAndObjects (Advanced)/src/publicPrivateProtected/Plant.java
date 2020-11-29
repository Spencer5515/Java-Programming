package publicPrivateProtected;

public class Plant {
	// accessible anywhere
	public final static int id = 5; // final = const / static = static
	
	private String name;	
	private String type;
	
	protected String size;
	
	////////////////////////////////////
	
	public Plant() { 
		setName("Bruce");
		setType("Grass");
		size = "Very Small and Thin";
	} // constructor
	
	// setters
	public void setName(String s) { name = s; }
	
	public void setType(String s) { type = s; }
	
	// getters
	public String getName() { return name; }
	
	public String getType() { return type; }
	
	public String getSize() { return size; }
	
}
