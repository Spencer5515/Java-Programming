import java.util.ArrayList;

public class Generics { 
	// Generic classes need <dataType> to make non-generic
	// Generic because they can be used for all types

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		
		sList.add("cat");
		sList.add("dog");
		sList.add("alligator");
		
		String animal = sList.get(1); // gets <String> at index '1'
		System.out.println(animal);
		
		
	} // main
}
