package interfaces;

public class Person implements Info {
	private String name;
	
	public Person(String s) {
		super();
		name = s;
	} // constructor

	public void greet() {
		System.out.println("Hello There!");
	}

	@Override
	public void showInfo() {
		System.out.println("Person's name is: " + name);
	}
}
