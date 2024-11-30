//
//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//lowercase -> 11
//digit -> 2
//space -> 1
//special char -> 1
//
//Hint : use Character class static methods.

package komal.String;

public class CountOfString {

	void getCharacterCout(String input) {
		int isLowerCaseCount = 0, isUpperCaseCount = 0, isDigitCount = 0, specialCharCount = 0, spaceCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isLowerCase(ch)) {
					isLowerCaseCount++;
				} else {
					isUpperCaseCount++;
				}
			} else if (Character.isDigit(ch)) {
				isDigitCount++;
			} else if (ch == ' ') {
				spaceCount++;
			} else {
				specialCharCount++;
			}
		}
		System.out.println("Count of Uppercase is : " + isUpperCaseCount);
		System.out.println("Count of Lowercase is : " + isLowerCaseCount);
		System.out.println("Count of Digit Count is : " + isDigitCount);
		System.out.println("Count of Space Count is : " + spaceCount);
		System.out.println("Count of Special character Count is : " + specialCharCount);
	}

	public static void main(String[] args) {
		CountOfString countOfString = new CountOfString();
		countOfString.getCharacterCout("Te4c_hno Credi3ts");
	}
}
