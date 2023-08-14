package multi_Dimensional_Array;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		
		// 1st WAY : Declare and Instantiate Two-Dimensional Array
		// We use this notation when we already know the size of an array i.e. 3 X 2 
		
		int [][] a = new int[3][2];  // 3 Rows, 2 Columns
		
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

	}

}
