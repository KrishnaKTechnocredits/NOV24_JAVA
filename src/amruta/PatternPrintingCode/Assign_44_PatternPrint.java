/*
 * Assignment - 44 : 8th Dec[10 mins]
write a logic to print below pattern.

*
* #
* # *
* # * #
 */
package amruta.PatternPrintingCode;

public class Assign_44_PatternPrint {

	static void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if(j % 2 == 0)
					System.out.print("#" + " ");
				else
					System.out.print("*" + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		printGivenPattern();
	}
}
