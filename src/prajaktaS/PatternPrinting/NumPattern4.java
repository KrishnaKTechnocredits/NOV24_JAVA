package prajaktaS.PatternPrinting;

public class NumPattern4 {

	void printNumPattern4() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.print(" "+i);
				
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		new NumPattern4().printNumPattern4();
	}

}
