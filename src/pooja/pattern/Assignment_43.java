package pooja.pattern;

/*
 * Assignment - 43 : 8th Dec[10 mins]

write a logic to print below pattern.

A
B C
D E F
G H I J
*/
public class Assignment_43 {

	void printCharPattern() {
		char ch = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_43 assignment_43 = new Assignment_43();
		assignment_43.printCharPattern();
	}
}