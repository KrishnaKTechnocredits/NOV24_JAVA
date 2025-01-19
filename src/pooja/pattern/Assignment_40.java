package pooja.pattern;

/*
 * Assignment - 40 : 8th Dec[15 mins]

write a logic to print below pattern.

1
2 3
4 5 6
7 8 9 10
*/
public class Assignment_40 {

	void printDigitPattern() {
		int cnt = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.printDigitPattern();
	}
}