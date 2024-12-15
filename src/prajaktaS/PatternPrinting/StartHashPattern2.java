package prajaktaS.PatternPrinting;

public class StartHashPattern2 {

	void PrintStarHashPattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		new StartHashPattern2().PrintStarHashPattern2();
	}
}
