package pooja.stringassignments;

/*Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.*/
public class Assignment_23 {

	void printUpperLowerDigitSpaceSpecialCharacter(String str) {
		System.out.println("The given string is : " + str);
		int lowerCount = 0, upperCount = 0, spaceCount = 0, digitCount = 0, spCount = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isLowerCase(c)) {
					lowerCount++;
				} else
					upperCount++;
			} else if (Character.isDigit(c))
				digitCount++;
			else if (c == ' ')
				spaceCount++;
			else
				spCount++;
		}
		System.out.println("The letters in upper case : " + upperCount);
		System.out.println("The letters in lower case : " + lowerCount);
		System.out.println("The digits in string  : " + digitCount);
		System.out.println("The spaces in string  : " + spaceCount);
		System.out.println("The special characters in string : " + spCount);
	}

	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.printUpperLowerDigitSpaceSpecialCharacter("Te4c_hno Credi3ts");
	}
}