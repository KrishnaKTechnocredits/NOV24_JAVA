package prem;

public class Assignment45 {

	void pattern() {
		String star = "*";
		String hash = "#";

		for (int i = 1; i <= 4; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 3; j++) {
					if (j % 2 != 0) {
						System.out.print(hash);
					} else
						System.out.print(star);
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					if (j % 2 != 0) {
						System.out.print(hash);
					} else
						System.out.print(star);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment45 assign45 = new Assignment45();
		assign45.pattern();
	}
}
