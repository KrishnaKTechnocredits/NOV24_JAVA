package roshan;

public class DistingCharacter {
	String str = "Te4c_hno Credi3ts";

	void allOperations() {
		int ucount = 0, lcount = 0, dcount = 0, spacecount = 0, specialcount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				ucount++;
			} else if (Character.isLowerCase(ch)) {
				lcount++;
			} else if (Character.isDigit(ch)) {
				dcount++;
			} else if (ch == ' ') {
				spacecount++;
			} else {
				specialcount++;
			}

		}

		System.out.println(" uppercase >>  " + ucount + "\n" + " lowercase >>  " + lcount + "\n" + " digit count is >> "
				+ " " + dcount + "\n" + " space count is >> " + spacecount + "\n" + " special character count >> "
				+ +specialcount);
	}

	public static void main(String[] args) {
		DistingCharacter distingcharacter = new DistingCharacter();
		distingcharacter.allOperations();

	}

}

/*
 * Assignment - 23 : 26th Nov'2024 [30 mins]
 * 
 * Print count of uppercase, lowercase, digit, space and special characters in
 * given input string. [20 mins]
 * 
 * Input : "Te4c_hno Credi3ts" Output : uppercase -> 2 lowercase -> 11 digit ->
 * 2 space -> 1 special char -> 1
 * 
 * Hint : use Character class static methods.
 */
