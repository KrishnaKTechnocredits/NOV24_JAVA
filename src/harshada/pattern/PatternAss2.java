//Assignment - 39 : 8th Dec[15 mins]
//
//write a logic to print below pattern.
//
//1
//1 2
//1 2 3
//1 2 3 4

package harshada.pattern;

public class PatternAss2 {
	static void printPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		PatternAss2.printPattern();
	}
}
