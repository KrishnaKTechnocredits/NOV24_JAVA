/*
 * Assignment - 45 : 10th Dec
write a logic to print below pattern.
 
#*#*#
#*#
#*#*#
#*#
 */
package amruta.PatternPrintingCode;

public class Assign_45_PatternPrint {

	static void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			int count = 0;
			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*" + " ");
						count++;
						if (count == 3)
							break;
					} else {
						System.out.print("#" + " ");
						count++;
						if (count == 3)
							break;
					}
				} else {
					if (j % 2 == 0)
						System.out.print("*" + " ");
					else
						System.out.print("#" + " ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Assign_45_PatternPrint.printGivenPattern();
	}
}
