/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment 23 | Nov 26 - Print count of uppercase, lowercase, digit, space
 * and special characters in given input string.
 * 
 * Time taken = 7 minutes
 */
public class Assignment23 {

	void printCharacterCounts(String str) {
		int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, spaceCount = 0, specialCharCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (Character.isLowerCase(str.charAt(i))) {
					lowerCaseCount++;
				} else {
					upperCaseCount++;
				}
			} else if (Character.isDigit(str.charAt(i))) {
				digitCount++;
			} else if (str.charAt(i) == ' ') {
				spaceCount++;
			} else {
				specialCharCount++;
			}
		}
		System.out.println("The count of upper case characters in the given string is: " + upperCaseCount);
		System.out.println("The count of lower case characters in the given string is: " + lowerCaseCount);
		System.out.println("The count of digits in the given string is: " + digitCount);
		System.out.println("The count of spaces in the given string is: " + spaceCount);
		System.out.println("The count of special characters in the given string is: " + specialCharCount);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		String input = "Te4c_hno Credi3ts";
		System.out.println("Given string is - " + input);
		assignment23.printCharacterCounts(input);
	}
}
