class Person3 {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int  getYearsToRetire() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() { return age; }
	
	String getName() { return name; }
}

public class Getters {

	public static void main(String[] args) {
		Person3 person1 = new Person3();
		person1.name = "Stephanie";
		person1.age = 20;
		
		person1.speak();	
		System.out.println("Age is: " + person1.getAge());
		System.out.println("Years to retirement: " + person1.getYearsToRetire());
		
	} // main
}
