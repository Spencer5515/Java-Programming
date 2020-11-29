package enumeratedData;

public enum Animal {
	CAT("Mittens"), DOG("Nemo"), MOUSE("Stuart");
	
	private String name;
	
	Animal(String s) { name = s; }

	public String getName() { return name; }

	public void setName(String s) { name = s; }
	
	public String toString() {
		return "This animal is called: " + name;
	}
}
