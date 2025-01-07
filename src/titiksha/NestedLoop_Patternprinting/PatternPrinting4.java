//Print below pattern 
// ******
// *    *
// *    * 
// *    *
// ******

package titiksha.NestedLoop_Patternprinting;

public class PatternPrinting4 {

	void patterPrinting(char ch) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {

				if (i == 1 || j == 1 || i == 6 - 1 || j == 7 - 1) {// logic we need character in only 1 column and column and 1 ro and last row 
					System.out.print(ch);
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		PatternPrinting4 patternPrinting4 = new PatternPrinting4();
		patternPrinting4.patterPrinting('*');
	}
}
