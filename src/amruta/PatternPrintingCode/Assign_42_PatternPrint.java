/*
 * Assignment - 42 : 8th Dec[10 mins]
write a logic to print below pattern.

1
2 2
3 3 3
4 4 4 4
 */
package amruta.PatternPrintingCode;

public class Assign_42_PatternPrint {

	static void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		printGivenPattern();
	}
}
