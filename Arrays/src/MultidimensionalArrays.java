
public class MultidimensionalArrays {

	public static void main(String[] args) {
// arrays of integers
		 int[][] grid = {
			{3, 5, 6}, 
			{2, 4, 9}, 
			{23, 56, 11}
		};
		 
		 System.out.println(grid[2][1] + "\n");
		 
// arrays of strings
		 String[][] texts = new String[2][3];
		 
		 texts[0][1] = "Hello there";
		 
		 System.out.println(texts[0][1] + "\n");
		
// printing 2d arrays
		 for (int r = 0; r < grid.length; r++) {
			 System.out.println("Row: " + r);
			 
			 for (int c = 0; c < grid[r].length; c++) {
				 System.out.print(grid[r][c] + " ");
			 } // inner for loop
			 
			 System.out.println();
		 } // outer for loop
		 System.out.println();
		 
// printing 2d string arrays
		 String[][] words = new String[2][];
		 
		 System.out.println(words[0]); // prints null
		 
		 words[0] = new String[3];
		 
		 words[0][1] = "hi there!";
		 
		 System.out.println(words[0][1]); // prints 'hi there!'

	} // main
}
