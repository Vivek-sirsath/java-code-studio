package setJavaCollection;

import java.util.HashSet;

public class HashSetSetOperations {

	public static void main(String[] args) {
		
		HashSet<Integer> setA = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		setA.add(5);
		System.out.println("Set A: " + setA);
		
		HashSet<Integer> setB = new HashSet<Integer>();
		setB.add(5);
		setB.add(2);
		setB.add(6);
		setB.add(4);
		setB.add(7);
		System.out.println("Set B: " + setB);
		
	    // Union of setA and setB
//		setB.addAll(setA);
//		System.out.println("Union: " + setB);
		
		// Intersection of setA and setB
//		setB.retainAll(setA);
//		System.out.println("Intersection: " + setB);
		
		// Difference of serA and setB
//		setA.removeAll(setB);
//		System.out.println("Difference: " + setA);
		
		// Is setB is subset of setA
		System.out.println(setA.containsAll(setB)); // false - No

	}

}
