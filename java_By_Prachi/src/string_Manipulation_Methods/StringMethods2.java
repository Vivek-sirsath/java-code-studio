package string_Manipulation_Methods;

public class StringMethods2 {

	public static void main(String[] args) {

		String s = "Welcome";

		// String substring(int startIngex, int endIndex) - method
		
		// come
		System.out.println(s.substring(3, 7)); 

		// Wel
		System.out.println(s.substring(0, 3));
		
		String p = "DO YOU KNOW";
		
		// KNOW
		System.out.println(p.substring(7, 11));
		
		String str = "Progressive";
		
		// startsWith()
		System.out.println(str.startsWith("Prog")); // true
		System.out.println(str.startsWith("rog")); // false
		
		// startWith(String str, int startIndex)
		System.out.println(str.startsWith("ress", 4)); // true
		
		// endsWith(String substring)
		System.out.println(str.endsWith("ive"));  // true
		
		
		String a = "House";
		String b = "house";
		
		//  boolean equals(Object anotherObject)
		System.out.println("By- equals() : " + a.equals(b)); // false
		
		// boolean equalsIgnoreCase(String anotherString)
		System.out.println("By- equalsIgnoreCase(): " + a.equalsIgnoreCase(b)); // true
		
		String c = "Wel";
		String d = "come";
		
		// Concatenation uing operator (+)
		System.out.println(c+d); // Welcome
		
		// Concatenation uing - concat() method
		System.out.println(c.concat(d)); // Welcome
		
	}

}
