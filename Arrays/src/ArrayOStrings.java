
public class ArrayOStrings {
	
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = " to ";
		words[2] = "you!";
		
		System.out.println(words[0] + words[1] + words[2] + "\n");
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		System.out.println(fruits[2]);
		
		// for (dataType <varibale name>: <array name>) { }
		for (String fruit: fruits) { 
			System.out.println(fruit);
		} // range-based for loop
		
		System.out.println();
		
		String text = null; // same as: 'String text;'
		
		System.out.println(text);
		

	} // main
}
