package pooja.pattern;

/*
 Assignment - 38 : 8th Dec [15 mins]
write a logic to print below pattern.

*
**
***
****
*/
public class Assignment_38 {
	void printStarPattern() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		assignment_38.printStarPattern();
	}
}