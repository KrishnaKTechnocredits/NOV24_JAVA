/* Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
*/

package nikita.stringdemo;

public class Assignment23 {
		
	void printCharCount(String str) {
	int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, spaceCount = 0, speCharCount = 0;
		for (int i=0; i<str.length(); i++) {
	//		char ch = str.charAt(i);
			if(Character.isLetter(str.charAt(i))) {
				if(Character.isUpperCase(str.charAt(i))) {
					upperCaseCount++;
				}else {
					lowerCaseCount++;
				}
			}
			else if (Character.isDigit(str.charAt(i))) {
					digitCount++;
			}
			else if (str.charAt(i) == ' ') {
				spaceCount++;
			}
			else {
				speCharCount++;
			}
		}	
		System.out.println("Total number of upper case characters are: " + upperCaseCount);
		System.out.println("Total number of lower case characters are: " + lowerCaseCount);
		System.out.println("Total number of spaces are: " + spaceCount);
		System.out.println("Total number of special characters are: " + speCharCount);
		System.out.println("Total number of digits are: " + digitCount);
	}

	public static void main(String[] args) {
		Assignment23 a23 = new Assignment23();
		String input = "Te4c_hno Credi3ts";
		System.out.println("Given String is: " + input);
		a23.printCharCount(input);
	}

}
