package roshan;

public class SumOfEvenDigitInString {

	static int evenDigitSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index); // Get the character at the current index
			if (Character.isDigit(ch)) { // Check if the character is a digit
				int digit = Character.getNumericValue(ch); // Convert character to its numeric value

				if (digit % 2 == 0) {
					sum = sum + digit;

				}

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(" Sum of even digit in String " + SumOfEvenDigitInString.evenDigitSum("te1ch2no3cre7dits"));
	}

}

/*
 * Assignment - 30 : 2nd Dec'2024 [15 mins]
 * 
 * Sum of all the even digits present in a given String.
 * 
 * 
 * input : "te1ch2no3cre7dits" output : 2
 * 
 * input : "techno" output : 0
 * 
 * input : "4563" output : 10
 */