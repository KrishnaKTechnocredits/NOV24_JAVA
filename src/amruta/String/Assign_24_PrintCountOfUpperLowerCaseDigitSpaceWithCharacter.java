/*
Assignment 24 : Print count of uppercase, lowercase, digit, space and special characters in given input string.

Friends,
Just a small thing: In the above program, along with the count of each type of letters, can you also print those letters?
Like, I'm expecting the output as follows:
uppercase -> 2 
TC

lowercase -> 11
echnoredits

digit -> 2
43

space -> 1

special char -> 1
_

*/

package amruta.String;

public class Assign_24_PrintCountOfUpperLowerCaseDigitSpaceWithCharacter {

	void printdata(String input) {
		int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0, spaceCount = 0;
		String upperCaseChar = "", lowerCaseChar = "", digits = "", specialChar = "";
		char ch;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCount++;
				upperCaseChar += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
				lowerCaseChar += ch;
			} else if (Character.isDigit(ch)) {
				digitCount++;
				digits += ch;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else {
				specialCount++;
				specialChar += ch;
			}
		}
		System.out.println(
				"Uppercase character count is : " + upperCount + " and Uppercase characters are : " + upperCaseChar);
		System.out.println(
				"Lowercase character count is : " + lowerCount + " and Lowercase characters are : " + lowerCaseChar);
		System.out.println("digit count is : " + digitCount + " and digits are : " + digits);
		System.out.println("space count is : " + spaceCount);
		System.out.println(
				"Special character count is : " + specialCount + " and Special characters are : " + specialChar);

	}

	public static void main(String[] args) {
		Assign_24_PrintCountOfUpperLowerCaseDigitSpaceWithCharacter a24 = new Assign_24_PrintCountOfUpperLowerCaseDigitSpaceWithCharacter();
		a24.printdata("Te4c_hnoCredi3t s@");
	}
}
