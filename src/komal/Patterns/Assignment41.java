//Assignment - 41 : 8th Dec[10 mins]
//
//write a logic to print below pattern.
//
//1 1 1 1
//2 2 2 2
//3 3 3 3
//4 4 4 4
//5 5 5 5

package komal.Patterns;

public class Assignment41 {
	void getPattern() {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Assignment41 a41 = new Assignment41();
		a41.getPattern();
	}
}
