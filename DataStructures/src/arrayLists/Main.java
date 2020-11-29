package arrayLists;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("===== ARRAYLIST =====");
		
		ArrayList<Integer> nums = new ArrayList<Integer>(6);
		
		System.out.println();
		System.out.println("Max Size: " + nums.getMaxSize());
		System.out.println("Length: " + nums.getLength());
		System.out.println("isEmpty? " + nums.isEmpty());
		System.out.println("isFull? " + nums.isFull());
		System.out.println();
		
		System.out.println("Appending 4 elements...");
		nums.append(15);
		nums.append(35);
		nums.append(23);
		nums.append(78);
		nums.append(67);
		
		System.out.println();
		System.out.println("Max Size: " + nums.getMaxSize());
		System.out.println("Length: " + nums.getLength());
		System.out.println("isEmpty? " + nums.isEmpty());
		System.out.println("isFull? " + nums.isFull());
		System.out.println();
		
		System.out.println("Inserting element at index 4...");
		nums.insert(4, 42);
		
		System.out.println();
		System.out.println("Max Size: " + nums.getMaxSize());
		System.out.println("Length: " + nums.getLength());
		System.out.println("isEmpty? " + nums.isEmpty());
		System.out.println("isFull? " + nums.isFull());
		System.out.println();
		
		System.out.println("Element at index 3 is: " + nums.getElement(3));
		
		System.out.println();
		System.out.println("Replacing element at index 2...");
		nums.replace(2, 89);
		
		System.out.println();
		System.out.println("Removing elements at indexes 3 and 4...");
		nums.remove(3);
		nums.remove(4);
		
		System.out.println();
		System.out.println("Max Size: " + nums.getMaxSize());
		System.out.println("Length: " + nums.getLength());
		System.out.println("isEmpty? " + nums.isEmpty());
		System.out.println("isFull? " + nums.isFull());
		System.out.println();
		
		System.out.println("Clearing list...");
		nums.clear();
		
		System.out.println();
		System.out.println("Max Size: " + nums.getMaxSize());
		System.out.println("Length: " + nums.getLength());
		System.out.println("isEmpty? " + nums.isEmpty());
		System.out.println("isFull? " + nums.isFull());
		
	} // main
}
