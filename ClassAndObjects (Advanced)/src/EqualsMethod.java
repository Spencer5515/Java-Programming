class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}

public class EqualsMethod {

	public static void main(String[] args) {
		Person p1 = new Person(5, "Stephanie");
		Person p2 = new Person(8, "Marissa");
		
		//p2 = p1; // points p2 to p1
		
		System.out.println(p1.equals(p2));
		
	} // main
}
