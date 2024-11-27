//Assignment - 23 : 26th Nov'2024 [30 mins]
//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//	lowercase -> 11
//	digit -> 2
//space -> 1
//	special char -> 1


package titiksha.Chararcterclass;

public class Characterclass {
	int uCount;
	int lCount;
	int spaceCount;
	int digitCount;
	int count;
	int specialCount;

	void countOfCharacter(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch) == true) {
				uCount++;
			} else if (Character.isLowerCase(ch) == true) {
				lCount++;
			} else if (ch == ' ') {
				spaceCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			}
			else
				specialCount++;
			}
		System.out.println("The Uppercase of given string is :"+uCount);
		System.out.println("The Lowercase of given string is :"+lCount);
		System.out.println("The space of given string is :"+spaceCount);
		System.out.println("The Digit of given string is :"+digitCount);
		System.out.println("The special character of given string is :"+specialCount);
	}
	

	public static void main(String[] args) {
		Characterclass characterclass = new Characterclass();
		characterclass.countOfCharacter("Te4c_hno Credi3ts");
		
	}

}
