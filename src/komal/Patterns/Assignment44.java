//Assignment - 44 : 8th Dec[15 mins]
//write a logic to print below pattern.
//
//*
//* #
//* # *
//* # * #
//* # * # *

package komal.Patterns;

public class Assignment44 {

	void displayPattern() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Assignment44 a44 = new Assignment44();
		a44.displayPattern();
	}
}
