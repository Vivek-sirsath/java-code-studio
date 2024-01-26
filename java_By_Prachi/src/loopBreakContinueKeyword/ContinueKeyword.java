package loopBreakContinueKeyword;

public class ContinueKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			// If we wish to exclude the condition 5
			// Execution will continue after 5 from printing 1 to 10 but will not print 5
			if(i == 5)
				continue;			
			System.out.print(i);
		}
		
	}

}
