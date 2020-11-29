package enumeratedData;

public class App {
	
	public static void main(String[] args) {
		Animal animal = Animal.DOG; // creates new enum object
		
		switch(animal) {
		case DOG:
			System.out.println("Doggo");
			break;
		case CAT:
			System.out.println("Weak Panther");
			break;
		case MOUSE:
			System.out.println("Was killed by chickens");
			break;
		default:
			System.out.println("Aminal Thing");
			break;
		} // switch
		
		System.out.println("Enum name: " + Animal.DOG.name()); // prints enum name as String
		
		System.out.println(Animal.DOG.getClass()); // prints name of enum class
		
		System.out.println(Animal.DOG instanceof Animal); // says if instance of particular class
		
		System.out.println();
		System.out.println(Animal.MOUSE.getName()); // uses getName() enum method
		
		System.out.println(Animal.CAT); // prints whatever is printed within toString() method
		
	} // main
}
  