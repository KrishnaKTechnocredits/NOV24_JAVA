package anuja.anuja_interview;

public class Pattern {

	public void m1() {
		// char ch = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int k = 6; k > i; k--) {
				System.out.print("  ");

			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// System.out.println("Hello, World!");
		Pattern print = new Pattern();
		print.m1();
	}

}
