package anuja.anuja_interview;

/*
 
#*#*#
#*#
#*#*#
#*#

*/
public class Assignment45 {

	void printPatern10(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 3; j++) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				}

			} else {
				for (int j = 1; j <= 5; j++) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}

				}
			}
			System.out.println();
		}
	}// method end

	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		assignment45.printPatern10(4);
	}
}
