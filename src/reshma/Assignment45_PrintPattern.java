package reshma;
/* write a logic to print below pattern.
#*#*#
#*#
#*#*#
#*#
*/

public class Assignment45_PrintPattern {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 4; i++) {			
			if (i % 2 == 0) {
				count = 3;
			} else {
				count = 5;
			}

			for (int j = 1; j <= count; j++) {
				if (j % 2 == 0) {
					System.out.print(" * ");
				} else
					System.out.print(" # ");
			}
			System.out.println();
		}
	}
}
