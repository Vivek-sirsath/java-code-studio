package string_Manipulation_Methods;

public class StringMethods1 {

	public static void main(String[] args) {

		String s = "ProGressive House";

		// charAt() - method
		System.out.println(s.charAt(3));

		// length() - method
		System.out.println("Length of string is: " + s.length());

		// toLowerCase() - method
		System.out.println("LowerCase: " + s.toLowerCase());

		// toLowerCase() - method
		System.out.println("UpperCase: " + s.toUpperCase());
		
		// replace() - method
		System.out.println("After replace: " + s.replace("ProGressive", "Deep"));
		
		// indexOf(char ref) - method
		System.out.println("Index of H: " + s.indexOf("H"));
		
		// substring(int startIndex) - method
		System.out.println("String begining from 5th index: " + s.substring(5));
		
		// isEmpty() - method
		System.out.println(s.isEmpty());    // false
		
		s= "";
        System.out.println(s.isEmpty());    // true
		
	}

}
