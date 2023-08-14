package session02;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Java";
		
//		System.out.println(str1+ " "+ str2); // 1st Way Concatenation
		
		System.out.println(str1+ " ".concat(str2));   // 2nd Way Concatenation using concat() method

	}

}
