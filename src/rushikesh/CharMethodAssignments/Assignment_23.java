package rushikesh.CharMethodAssignments;

public class Assignment_23 {

	void printCountOfCharacter(String str) {

		int uCount = 0;
		int lCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int specialCharCount = 0;

		System.out.println("Length of String =" + str.length());
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				uCount++;
			} else if (Character.isLowerCase(str.charAt(index))) {
				lCount++;
			} else if (Character.isDigit(str.charAt(index))) {
				digitCount++;
			} else if (str.charAt(index) == ' ') {
				spaceCount++;
			} else {
				specialCharCount++;
			}
		}
		System.out.println("Count of UpperCaseChar in string=" + uCount);
		System.out.println("Count of LowerCaseChar in string=" + lCount);
		System.out.println("Count of Digit in string=" + digitCount);
		System.out.println("Count of space in string=" + spaceCount);
		System.out.println("Count of special char in string=" + specialCharCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.printCountOfCharacter("Techno1 2 3Cr@edit");
	}

}
