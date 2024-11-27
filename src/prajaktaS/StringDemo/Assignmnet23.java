
/*  Print count of uppercase, lowercase, digit, space and special characters in given input string.

 */
package prajaktaS.StringDemo;

public class Assignmnet23 {

	int upperCaseCount, lowerCaseCount, spaceCount, SpecialCharCount, digitCount;
	boolean flag;

	int getUpperCaseLettersCount(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (Character.isUpperCase(name.charAt(index))) {
				upperCaseCount++;
			}
		}
		return upperCaseCount;
	}

	int getLowerCaseLettersCount(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (Character.isLowerCase(name.charAt(index))) {
				lowerCaseCount++;
			}

		}
		return lowerCaseCount;
	}

	int getLSpaceCount(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ' ') {
				spaceCount++;
			}

		}
		return spaceCount++;

	}

	int getDigitCount(String name) {
		for (int index = 0; index < name.length(); index++) {

			if (Character.isDigit(name.charAt(index))) {
				digitCount++;
			}

		}
		return digitCount++;

	}

	int getSpecialCharCount(String name) {
		for (int index = 0; index < name.length(); index++) {

			if (Character.isDigit(name.charAt(index)) == false && (Character.isUpperCase(name.charAt(index)) == false
					&& Character.isLowerCase(name.charAt(index)) == false && name.charAt(index) != ' ')) {
				SpecialCharCount++;
			}

		}
		return SpecialCharCount++;
	}

	public static void main(String[] args) {

		String name = "Te4c_hno Credi3ts";

		System.out
				.println(new Assignmnet23().getUpperCaseLettersCount(name) + " Upper case letters are in given string");
		System.out
				.println(new Assignmnet23().getLowerCaseLettersCount(name) + " Lower case letters are in given string");
		System.out.println(new Assignmnet23().getLSpaceCount(name) + " Spaces are in given string");
		System.out.println(new Assignmnet23().getDigitCount(name) + " Digits are in given string");
		System.out.println(new Assignmnet23().getSpecialCharCount(name) + " Special characters are in given string");
	}

}
