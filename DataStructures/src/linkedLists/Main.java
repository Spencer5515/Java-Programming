package linkedLists;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> myLL = new LinkedList<Integer>();
		
		Random rand = new Random();
		int upperbound = 25;
		
		for (int i = 0; i < 6; i++) {
			myLL.append(rand.nextInt(upperbound));
		} // for loop
		
		System.out.println("Displaying Linked List...");
		myLL.displayLL();
		
		System.out.println("\nIs myLL empty: " + myLL.isEmpty());
		System.out.println("myLL Length: " + myLL.getLength());
		
		System.out.println("Element at Node 3: " + myLL.getElement(3));
		
		System.out.println("\nInserting '15' at index 4...");
		myLL.insert(4, 15);
		System.out.println("myLL Length: " + myLL.getLength());
		
		myLL.displayLL();
		
		System.out.println("\nRemoving element at index 2...");
		myLL.remove(2);
		System.out.println("myLL Length: " + myLL.getLength());
		
		myLL.displayLL();
		
		System.out.println("\nClearing myLL...");
		myLL.clear();
		System.out.println("Is myLL empty: " + myLL.isEmpty());
		
		System.out.println("\nDisplaying Linked List...");
		myLL.displayLL();
	
		System.out.println("Program Ending...");
	} // main
}
