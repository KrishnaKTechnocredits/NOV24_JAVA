//Assignment - 45 : 10th Dec 
//#*#*#
//#*#
//#*#*#
//#*#

package komal.Patterns;

public class Assignment45 {

	void getPattern() {
		int row = 4;
		int col = 5;
		for (int i = 1; i <= row; i++) {
			col = (i % 2 == 0) ? 3 : 5;
			for (int j = 1; j <= col; j++) {
				if (j % 2 == 0) {
					System.out.print("*");

				} else {
					System.out.print("#");

				}
			}

			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment45 a45 = new Assignment45();
		a45.getPattern();
	}

}
