package singleDimnsionArray;

public class singleDimensionArray1 {

	public static void main(String[] args) {
		
		// Declaration and Instantiation
		int[] rollNo = new int [8];
		
		// Inserting values in array
		rollNo[0] = 11;
		rollNo[1] = 12;
		rollNo[2] = 13;
		rollNo[3] = 14;
		rollNo[4] = 15;
		rollNo[5] = 16;
		rollNo[6] = 17;
		rollNo[7] = 18;
		
		// Print number of elements in array
		System.out.println("No.of elements in Array: " + rollNo.length);
		
		// Print each element in array
		System.out.println("using for loop");
		for(int i = 2; i < rollNo.length-2; i++ ) {
			System.out.println(rollNo[i]);
		}
		
		// for each loop / enhanced for loop
		System.out.println("Using for each loop");
		for(int e : rollNo) {
			System.out.println(e);
		}

	}

}
