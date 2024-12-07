package pratik;

public class Assignment23 {
	int ucount;
	int lcount;
	int dcount;
	int scount;
	int spcount;

	void upperlower(String str) {
		for (int num = 0; num < str.length(); num++) {
			if (Character.isLetter(str.charAt(num))) {
				if (Character.isUpperCase(str.charAt(num))) {
					ucount++;
				}

				else
					lcount++;

			} else if (Character.isDigit(str.charAt(num))) {
				dcount++;
			} else {
				if (str.charAt(num) == ' ') {
					scount++;
				} else {
					spcount++;
				}
			}

		}
		System.out.println("Uppercase letter count is " + ucount);
		System.out.println("Lowercase letter count is " + lcount);
		System.out.println("Lowercase letter count is " + dcount);
		System.out.println("Lowercase letter count is " + scount);
		System.out.println("Lowercase letter count is " + spcount);
	}

	public static void main(String[] args) {
		new Assignment23().upperlower("Te4c_hno Credi3ts");

	}

}
