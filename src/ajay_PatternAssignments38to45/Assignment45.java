
/*
 #*#*#
 #*#
 #*#*#
 #*#
 */

package ajay_PatternAssignments38to45;

public class Assignment45 {

	void patternPrinting() {
		for (int j = 1; j <= 4; j++) {
			int A;
			if (j % 2 == 0) {
				A = 3;
			} else {
				A = 5;
			}
			for (int i = 1; i <= A; i++) {
				if (i % 2 == 1) {
					System.out.print("#");
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Assignment45 pattern8 = new Assignment45();
		pattern8.patternPrinting();

	}

}
