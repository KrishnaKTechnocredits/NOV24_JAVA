package prajaktaS.PatternPrinting;

public class StarPattern {

	void printStarPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
		

	}

	public static void main(String[] args) {
		new StarPattern().printStarPattern();

	}

}
