
public class StringFormatting {

	public static void main(String[] args) {
		// inefficient way to append
		/*
		String info = "";
		
		info += "My name is Steph";
		info += ", ";
		info += "I am a dancer";
		System.out.println(info);
		*/
		
		// better implementation
		// way more efficient
		StringBuilder sb = new StringBuilder();
		
		sb.append("My name is Steph, ");
		sb.append("I am a dancer!");
		System.out.println(sb.toString());
		
		///// Formatting /////
		// d = integer
		// f = double & float
		// s = String
		
		System.out.println();
		System.out.println("This is a test\t of tab");
		
		System.out.printf("Total cost: %-5d Quantity: %d", 5, 120);
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.printf("%2d: some text here\n", i);
		} // for loop
		
		System.out.println();
		for (int i = 5; i < 10; i++) {
			System.out.printf("%2d: %s\n", i, "some text here");
		} // for loop
		
		System.out.println();
		System.out.printf("Total value: %.2f\n", 5.687); // .2 == decimal precision
		
	} // main
}
