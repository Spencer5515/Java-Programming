package polymorphism;

// child class
public class Tree extends Plant {

	@Override // overrides parent method
	public void grow() {
		System.out.println("Tree Growing");
	}
	
	public void shedLeaves() {
		System.out.println("Leaves Falling (only in Autumn)");
	}

}
