package dictionaries;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("===== ARRAYLIST DICTIONARY =====\n");
		// Its best to just use the Dictionary Java Collection
		
		ALDict<String, String> dict = new ALDict<String, String>(100);
		int userChoice = 0;
		Scanner in = new Scanner(System.in);
		String userWord = "";
		String s = "";
		int findS = 0;
		boolean flag = false;
		
		dict.insert("dog", "a domesticated fluff ball");
	    dict.insert("igloo", "a cool house");
	    dict.insert("banana", "a fruit that many like, or a phone");
	    dict.insert("haskell", "fantastic programming language, go learn it");
	    dict.insert("graph", "an awesome data structure!");
	    dict.insert("quack", "said Mr. Duck");
	    dict.insert("phoenix", "a bird on fire");
	    dict.insert("cactus", "a pointy plant");
	    
	    System.out.println("Welcome to my ArrayList Dictionary program!");
	    System.out.println("Here are your options:");
	    System.out.println("\t1. Find");
	    System.out.println("\t2. Insert");
	    System.out.println("\t3. Remove");
	    System.out.println("\t4. Size");
	    System.out.println("\t5. Clear");
	    System.out.println("\t6. Quit");
	    
	    do {
	    	System.out.print("Enter your option: ");
	    	userChoice = in.nextInt();
	    	in.nextLine();
	    	System.out.println();
	    	
	    	switch(userChoice) {
	    	case 1:
	    		System.out.print("Enter a key to search the dictionary: ");
	    		userWord = in.nextLine();
	    			
	    		findS = dict.find(userWord);
	    		if (findS != -1) {
	    			System.out.println("It is at Index " + findS);
	    		} // if
	    		
	    		System.out.println();
	    		break;
	    		
	    	case 2:
	    		System.out.print("Enter the key of the new Record: ");
	    		userWord = in.nextLine();
	    		
	    		System.out.print("Enter the value of the new record: ");
	    		s = in.nextLine();
	    		
	    		dict.insert(userWord, s);
	    		System.out.println();
	    		break;
	    		
	    	case 3:
	    		System.out.print("Enter the key of the record to be removed: ");
	    		userWord = in.nextLine();
	    		
	    		dict.remove(userWord);
	    		System.out.println();
	    		break;
	    		
	    	case 4:
	    		System.out.println("Dictionary size is: " + dict.size());
	    		System.out.println();
	    		break;
	    		
	    	case 5:
	    		System.out.println("Clearing out my dictionary...");
	    		dict.clear();
	    		System.out.println("Cleared!");
	    		System.out.println();
	    		break;
	    		
	    	case 6:
	    		System.out.println("Program Terminated...");
	    		flag = true;
	    		break;
	    		
	    	} // switch
	    } while (!flag); // while

		System.out.println("Program Ending...");
	} // main
}
