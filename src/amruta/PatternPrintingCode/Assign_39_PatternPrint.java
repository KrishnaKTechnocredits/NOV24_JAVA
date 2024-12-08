/*
 * Assignment - 39 : 8th Dec[15 mins]
 * 
write a logic to print below pattern.
1 
1 2 
1 2 3 
1 2 3 4 
 */

package amruta.PatternPrintingCode;

public class Assign_39_PatternPrint {

	void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Assign_39_PatternPrint a39 = new Assign_39_PatternPrint();
		a39.printGivenPattern();
	}
}
