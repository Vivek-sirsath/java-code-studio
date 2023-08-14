package session02;

public class Operators {

	public static void main(String[] args) {

		// Arithmetic Operators (+,-,/,%,*,++,--)
		int a = 10;
		int b = 5;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b); // Returns Reminder of 10/5 = 0
		System.out.println(a * b);

		// Unary Operator
		System.out.println("---------------------Unary Operator--------------------");
		// Increment (++)
		// Pre-increment (++Expression)
		// Post increment (Expression++)
		// LHS values to be consider
		System.out.println(++a); // 10+1=11,11
		System.out.println(a++); // 11,11+1=12

		// Decrement Operator(--)
		System.out.println(a--); // 12-1=11,11
		System.out.println(--a); // 11-1=10,10
		System.out.println(a++ + ++a); // 10,10+1=11 + 11+1=12,12
		System.out.println(++a + --a); // 12+1=13,13 + 13-1=12,12

		// Relational Operator / Comparison Operator (=,!=,>,<,>=,<=)
		System.out.println("--------------------Relational Operator--------------------");
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // true & false = true
		System.out.println(a <= b); // false & false = false

		// Assignment Operator (=)
		System.out.println("-----------------Assignment Operator---------------");
		// a = b; // initially a=10, but using assignment operator a become a=5
		System.out.println(a);
		// System.out.println(b);

		// Logical Operators (&&,||,!)
		System.out.println("------------------Logical Operator----------------");
		boolean w = false;
		boolean x = true;
		boolean y = false;
		boolean z = true;

		System.out.println(x && y); // false
		System.out.println(x && z); // true
		System.out.println(w && y); // false
		System.out.println(x || z); // true
		System.out.println(y || z); // true
		System.out.println(x || y); // true
		System.out.println(w || y); // false
		System.out.println(!y); // true

		// Conditional Operator / Ternary Operator
		System.out.println("------------Conditional Operator / Ternary Operator----------------");
		// dataType variableName = (condition) ? expression1 : expression2
		// If we wish to print the less value among a & b using ternary operator

		int minimum = (a < b) ? a : b;
		System.out.println(minimum);

		int max = (b < a) ? a : b;
		System.out.println(max);

	}

}
