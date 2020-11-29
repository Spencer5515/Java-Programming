package publicPrivateProtected;

public class App {
	
	public static void main(String[] args) {
		Plant plant1 = new Plant(); // new plant Object
		
		System.out.println("Plant Name: " + plant1.getName());
		System.out.println("Plant ID: " + plant1.id);
		System.out.println("Plant Type: " + plant1.getType());
		System.out.println("Plant Size: " + plant1.getSize());
		
		System.out.println();
		OakTree oak = new OakTree(); // new OakTree Object (child)
		
		System.out.println("Plant Name: " + oak.getName());
		System.out.println("Plant ID: " + oak.id);
		System.out.println("Plant Type: " + oak.getType());
		System.out.println("Plant Size: " + oak.getSize());
		System.out.println("Where Typically Found: " + oak.whereFound());
		
	} // main
}
