package nitish;

public class Pattern3 {
	void output() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern3 p = new Pattern3();
		p.output();

	}

}
