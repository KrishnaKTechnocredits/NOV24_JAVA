package rushikesh.CharMethodAssignments;

public class Assignment_34 {

	void getDigitCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if (currentChar == ch) {
				count++;
			}
		}
		System.out.println(ch + "->" + count);
	}

	void giveChar(String str) {
		System.out.println("Frequency of Digit in Given String is -");
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			int currentIndex = str.indexOf(currentChar);
			if (Character.isDigit(currentChar)) {
				if (currentIndex == index) {
					getDigitCount(str, currentChar);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment_34 assignment_34 = new Assignment_34();
		assignment_34.giveChar("A2b23H%34H33288");
	}
}
