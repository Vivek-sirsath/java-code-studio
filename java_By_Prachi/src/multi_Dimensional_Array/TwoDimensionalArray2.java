package multi_Dimensional_Array;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {

		// 2nd WAY : Declare and Instantiate Two-Dimensional Array
		// We use this notation when we don't know the size of an array
		// We can modify the size of an array in this way at runtime.

		int[][] a = { { 5, 6 }, { 7, 8 }, { 1, 2 }, {8,9} };
		
		// At runtime we can change the values in array
		a[1][1] = 4;   // replaced 8 by 12

		// Print Rows and Columns
		System.out.println("No. of rows" + " = " + a.length);
		System.out.println("No. of colums" + " = " + a[0].length);

		
		// Read the values from array
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[0].length; j++) {
				
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
