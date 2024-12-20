package pooja.pattern;

/*
Assignment - 38 : 8th Dec [15 mins]
write a logic to print below pattern.

#*#*#
#*#
#*#*#
#*#

*/
public class Assignment_45 {

	void printPattern() {
		for (int i2 = 1; i2 < 3; i2++) {
			for (int i = 1; i <= 5; i++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
			for (int i = 1; i <= 5 - 2; i++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_45 assignment_45 = new Assignment_45();
		assignment_45.printPattern();
	}
}