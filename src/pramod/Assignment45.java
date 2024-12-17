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
		String String1 = "# * # * #";
		String String2 = "# * #";
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j >= 1; j--) {
				if (i % 2 == 0) {
					System.out.println(String2);
				} else
					System.out.println(String1);
			}
		}
	}

	public static void main(String[] args) {
		Assignment45 PP45 = new Assignment45();
		PP45.printPattern();
	}
}