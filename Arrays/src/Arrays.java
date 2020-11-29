
public class Arrays {
	
	public static void main(String[] args) {
		int[] vals = new int[5]; // array pointer
		
// initializing array
		for (int i = 0; i < vals.length; i++) {
			vals[i] = i * 2;
		} // for loop
// printing array
		for (int i = 0; i < vals.length; i++) {
			System.out.print(vals[i]);
			System.out.print(" ");
		} // for loop
		
		System.out.println();
		
		vals[0] = 32;
		vals[3] = 15;

// printing array
		for (int i = 0; i < vals.length; i++) {
			System.out.print(vals[i]);
			System.out.print(" ");
		} // for loop
		
		System.out.println();
		
		int[] nums = {5, 6, 7}; // normal array

// printing array
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			System.out.print(" ");
		} // for loop
		
	} // main
}
