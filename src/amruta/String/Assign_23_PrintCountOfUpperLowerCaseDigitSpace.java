/*
Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
*/

package amruta.String;

public class Assign_23_PrintCountOfUpperLowerCaseDigitSpace {

	void printdata(String input) {
		int upper = 0, lower = 0, digit = 0, special = 0;
		char ch;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				special++;
			}

		}
		System.out.println("Uppercase character count is : " + upper);
		System.out.println("Lowercase character count is : " + lower);
		System.out.println("digit count is : " + digit);
		System.out.println("Special character count is : " + special);

	}

	public static void main(String[] args) {
		Assign_23_PrintCountOfUpperLowerCaseDigitSpace a23 = new Assign_23_PrintCountOfUpperLowerCaseDigitSpace();
		a23.printdata("Te4c_hnoCredi3ts");
	}
}
