package siddharth;

public class Assignment23 {

	void printCount(String str) {
		int dcount = 0;
		int ucount = 0;
		int lcount = 0;
		int spacecount = 0;
		int scount = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					ucount++;
				} else {
					lcount++;
				}
			} else if (Character.isDigit(ch)) {
				dcount++;
			} else if (ch == ' ') {
				spacecount++;

			} else {
				scount++;
			}
		}
		System.out.println("Output : uppercase -> " + ucount);
		System.out.println("lowerrcase -> " + lcount);
		System.out.println("digit -> " + dcount);
		System.out.println("space -> " + spacecount);
		System.out.println("special char -> " + scount);
	}

	public static void main(String[] args) {
		new Assignment23().printCount("Te4c_hno Credi3ts");
	}
}
