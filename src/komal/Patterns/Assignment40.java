//Assignment - 40 : 8th Dec[15 mins]
//
//write a logic to print below pattern.
//
//1
//2 3
//4 5 6
//7 8 9 10

package komal.Patterns;

public class Assignment40 {

	void getPattern() {
		int n = 5;
		int count = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Assignment40 a40 = new Assignment40();
		a40.getPattern();
	}
}
