/*
Assignment - 45 : 10th Dec 
#*#*#
#*#
#*#*#
#*#
*/

package pramod;

class Assignment45 {

	void printPattern() {

		for (int i = 1; i < 5; i++) {
			int flag = 0;
			if (i % 2 == 0) {
				flag = 3;
			} else
				flag = 5;
			for (int j = 1; j < flag; j++) {
				if (j % 2 == 0) {
					System.out.print("* ");
				}

				else
					System.out.print("# ");
			}
			System.out.println("# ");
		}
	}

	public static void main(String[] args) {
		Assignment45 PP45 = new Assignment45();
		PP45.printPattern();
	}
}