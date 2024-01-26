package loopBreakContinueKeyword;

public class BreakKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			// If we wish to print only 1 to 4
			// execution after 5 will not execute
			if (i == 5)
				break;
			System.out.println(i);
		}

	}

}
