package stacks;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayStack<Integer> astack = new ArrayStack<Integer>(6);
		
		Random rand = new Random();
		int upperbound = 25;
		
		System.out.println("===== ARRAY STACK =====\n");
		System.out.println("Max Size: " + astack.getMaxSize());
		System.out.println("Length: " + astack.getLength());
		System.out.println("isEmpty? " + astack.isEmpty());
		System.out.println("isFull? " + astack.isFull());
		System.out.println();
		
		System.out.println("Adding elements to stack...");
		for (int i = 0; i < astack.getMaxSize(); i++) {
			astack.push(rand.nextInt(upperbound));
		} // for loop
		
		System.out.println();
		System.out.println("Max Size: " + astack.getMaxSize());
		System.out.println("Length: " + astack.getLength());
		System.out.println("isEmpty? " + astack.isEmpty());
		System.out.println("isFull? " + astack.isFull());
		System.out.println();
		
		System.out.println("Popping 3 elements off of stack...");
		astack.pop();
		astack.pop();
		astack.pop();
		
		System.out.println("Item at the top of the stack: " + astack.top());
		
		System.out.println();
		System.out.println("Max Size: " + astack.getMaxSize());
		System.out.println("Length: " + astack.getLength());
		System.out.println("isEmpty? " + astack.isEmpty());
		System.out.println("isFull? " + astack.isFull());
		System.out.println();
		
		System.out.println("Clearing stack...");
		astack.clear();
		
		System.out.println();
		System.out.println("Max Size: " + astack.getMaxSize());
		System.out.println("Length: " + astack.getLength());
		System.out.println("isEmpty? " + astack.isEmpty());
		System.out.println("isFull? " + astack.isFull());
		System.out.println();
		
		System.out.println("Program Ending...");
		
	} // main
}
