//
//Assignment - 42 : 8th Dec[10 mins]
//
//write a logic to print below pattern.
//
//1
//2 2
//3 3 3
//4 4 4 4

package komal.Patterns;

public class Assignment42 {
	void getPattern() {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Assignment42 a42 = new Assignment42();
		a42.getPattern();
	}
}
