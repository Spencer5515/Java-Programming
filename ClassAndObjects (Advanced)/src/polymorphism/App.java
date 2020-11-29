package polymorphism;

public class App {
	
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1; // points plant2 to tree1
		
		plant2.grow(); // calls overridden child method
		
		tree1.shedLeaves();
		//plant2.sheLeaves(); // ERROR: no shedLeaves() under type<Plant>
							  // shedLeaves() only exists under type<Tree>
	} // main
	
	public static void doGrow(Plant plant) { 
		plant.grow(); 
	} // doGrow method
	
}
