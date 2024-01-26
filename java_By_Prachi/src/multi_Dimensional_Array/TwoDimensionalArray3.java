package multi_Dimensional_Array;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {

		// 1st WAY : Declare and Instantiate Two-Dimensional Array
		// We use this notation when we already know the size of an array i.e. 3 X 2

		int[][] a = new int[3][2]; // 3 Rows, 2 Columns

		// Insert values in array

		a[0][0] = 12;
		a[0][1] = 13;

		a[1][0] = 14;
		a[1][1] = 15;

		a[2][0] = 16;
		a[2][1] = 17;

		// Print Rows and Columns
		System.out.println("No. of rows" + " = " + a.length);
		System.out.println("No. of colums" + " = " + a[0].length);

		// To print all the elements
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) { // j[0] is first column

//				System.out.println(a[i][j]); // This will print one by one
				System.out.print(a[i][j] + " "); // This will print column side by side
			}

			System.out.println();
		}

	}

}
