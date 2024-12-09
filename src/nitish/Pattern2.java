package nitish;

public class Pattern2 {
	void output() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Pattern2 p = new Pattern2();
		p.output();

	}
}
