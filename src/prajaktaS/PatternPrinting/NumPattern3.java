package prajaktaS.PatternPrinting;

public class NumPattern3 {

		void printNumPattern3() {
			for (int i = 1; i <= 4; i++) {

				for (int j = 1; j <= i; j++) {

					System.out.print(" "+j);
					
				}
				System.out.println(" ");
			}

		}

		public static void main(String[] args) {
	new NumPattern3().printNumPattern3();
		}

	}


