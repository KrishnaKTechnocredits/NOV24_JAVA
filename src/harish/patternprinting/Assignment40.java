package harish.patternprinting;

/**
 * Assignment - 40 : 8th Dec
 * 
 * Write a logic to print below pattern.
 */
// 1
// 2 3
// 4 5 6
// 7 8 9 10

public class Assignment40 {

	private void printPattern() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.printPattern();
	}
}