package prajaktaS.PatternPrinting;

public class NumPattern1 {
	
	void printNumPattern1() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" "+i);
				
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
new NumPattern1().printNumPattern1();
	}

}
