package nitish;

public class Pattern4 {
	void output() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print("*" + " ");
				} else {
					System.out.print("#" + " ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Pattern4 pattern = new Pattern4();
		pattern.output();

	}
}
