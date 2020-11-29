
class Person {
	String name;
	int age;
}

public class ClassesAndObjects {
	
	public static void main(String[] args) {
		Person person1 = new Person();	
		person1.name = "Stephanie";
		person1.age = 20;
		
		Person person2 = new Person();	
		person2.name = "Spencer";
		person2.age = 21;
		
		System.out.println("First person's name & age is: " + person1.name + 
				" / " + person1.age);
		System.out.println("Second person's name & age is: " + person2.name + 
				" / " + person2.age);
		
	} // main
}
