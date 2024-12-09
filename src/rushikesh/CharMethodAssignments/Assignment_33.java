package rushikesh.CharMethodAssignments;

public class Assignment_33 {

	void getUpperCaseFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if (currentChar == ch) {
				count++;
			}
		}
		System.out.println(ch + "->" + count);
	}

	void giveCharMethod(String str) {
		System.out.println("Frequency of Upper char in given String-");
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			int currentIndex = str.indexOf(currentChar);
			if (Character.isUpperCase(currentChar)) {
				if (currentIndex == index) {
					getUpperCaseFrequency(str, currentChar);
				}

			}
		}
	}

	public static void main(String[] args) {
		Assignment_33 assignment_33 = new Assignment_33();
		assignment_33.giveCharMethod("AABcBBBAdedd");
	}
}
