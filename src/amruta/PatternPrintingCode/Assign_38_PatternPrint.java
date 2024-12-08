/*
 * Assignment - 38 : 8th Dec [15 mins]
write a logic to print below pattern.

*
**
***
****
 */
package amruta.PatternPrintingCode;

public class Assign_38_PatternPrint {

	void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Assign_38_PatternPrint a38 = new Assign_38_PatternPrint();
		a38.printGivenPattern();
	}
}
