


package prajaktaS.PatternPrinting;

public class charPattern {

	void printCharPattern() {
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		new charPattern().printCharPattern();

	}

}
