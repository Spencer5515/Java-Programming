
class Person2 {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello there!");
		System.out.println("My name is " +  name + " and I am " + age + " years old!\n");
	} // speak method
}

public class Methods {
	
	public static void main(String[] args) {
		Person2 person1 = new Person2();	
		person1.name = "Stephanie";
		person1.age = 20;
		person1.speak();
		
		Person2 person2 = new Person2();	
		person2.name = "Spencer";
		person2.age = 21;
		person2.speak();
		
		System.out.println();
		
		System.out.println("First person's name & age is: " + person1.name + 
				" / " + person1.age);
		System.out.println("Second person's name & age is: " + person2.name + 
				" / " + person2.age);
		
	} // main
}
