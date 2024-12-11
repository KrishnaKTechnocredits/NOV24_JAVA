package rohan;

public class Assignment45 {
	void pattern() {
		for (int i = 1; i <= 4; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= 5; j++) {
					if (j % 2 == 1) {
						System.out.print("# ");
					}
					if (j % 2 == 0) {
						System.out.print("* ");
					}

				}
			}
			if (i % 2 == 0) {
				for (int j = 1; j <= 3; j++) {
					if (j % 2 == 1) {
						System.out.print("# ");
					}
					if (j % 2 == 0) {
						System.out.print("* ");
					}
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Assignment45 assignment = new Assignment45();
		assignment.pattern();
	}
}
