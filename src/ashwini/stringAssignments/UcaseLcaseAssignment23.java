package ashwini.stringAssignments;

public class UcaseLcaseAssignment23 {
	int index;

	void lCaseUcase(String input) {
		int lcount = 0;
		int ucount = 0;
		int dcount = 0;
		int scount = 0;
		int spacecount = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
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

		System.out.println("uppercase ->" + ucount);
		System.out.println("lowerercase ->" + lcount);
		System.out.println("Digit ->" + dcount);
		System.out.println("Spacecount ->" + scount);
		System.out.println("Special char ->" + scount);
	}
	}
	public static void main(String[] args) {
		UcaseLcaseAssignment23 assn23 = new UcaseLcaseAssignment23();
		assn23.lCaseUcase("Te4c_hno Credi3ts");
	}
}
