/*
 * Assignment - 39 : 8th Dec[15 mins]
write a logic to print below pattern.
1
2 3
4 5 6
7 8 9 10
 */

package amruta.PatternPrintingCode;

public class Assign_40_PatternPrint {

	void printGivenPattern() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Assign_40_PatternPrint a40 = new Assign_40_PatternPrint();
		a40.printGivenPattern();
	}
}
