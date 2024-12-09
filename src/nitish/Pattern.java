package nitish;

public class Pattern {
	void output() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		pattern.output();

	}
}
