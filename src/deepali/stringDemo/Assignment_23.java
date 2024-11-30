package deepali.stringDemo;

/*Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
*/
public class Assignment_23 {
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int digitCount = 0;
	int spaceCount = 0;
	int specialCharCount = 0;

	void getCount(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) == true)
				upperCaseCount++;
			else if (Character.isLowerCase(ch) == true)
				lowerCaseCount++;
			else if (Character.isDigit(ch) == true)
				digitCount++;
			else if (str.charAt(index) == ' ')
				spaceCount++;
			else
				specialCharCount++;
		}
		System.out.println("Uppercase Count : " + upperCaseCount);
		System.out.println("Lowercase Count : " + lowerCaseCount);
		System.out.println("digitCount Count : " + digitCount);
		System.out.println("spaceCount Count : " + spaceCount);
		System.out.println("specialCharCount Count : " + specialCharCount);
	}

	public static void main(String[] args) {
		Assignment_23 assignment = new Assignment_23();
		assignment.getCount("Te4c_hno Credi3ts");
	}

}
