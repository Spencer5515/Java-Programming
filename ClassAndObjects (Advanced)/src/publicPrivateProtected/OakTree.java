package publicPrivateProtected;

public class OakTree extends Plant {
	
	private String where = "I am found in the California Foothills";
	
	public OakTree() {
		setName("Theodor");
		setType("OakTree");
		size = "Medium, for a tree";
	} // constructor
	
	public String whereFound() { return where; }
	
}
