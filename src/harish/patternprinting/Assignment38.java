package harish.patternprinting;

/**
 * Assignment - 38 : 8th Dec
 * 
 * Write a logic to print below pattern.
 */
// *
// **
// ***

public class Assignment38 {

	void printPattern() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		assignment38.printPattern();
	}
}