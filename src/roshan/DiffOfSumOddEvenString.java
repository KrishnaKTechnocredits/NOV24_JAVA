package roshan;

public class DiffOfSumOddEvenString {
	static int oddEvenDigitDiff(String str) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if (digit % 2 == 0) {
					evenSum = evenSum + digit;
				} else {
					oddSum = oddSum + digit;

				}

			}
		}
		int diffInSum = oddSum - evenSum;                //mistake this was added in loop
		return diffInSum;
	}

	public static void main(String[] args) {
		System.out.println(" Diffrece in sum of odd and even number is "
				+ DiffOfSumOddEvenString.oddEvenDigitDiff("te1ch2no3cre7dits"));

	}
}

/*
 * Assignment - 31 : 2nd Dec'2024 [15 mins]
 * 
 * return the difference of Sum of all the odd digits and even digits present in
 * a given String. HINT : sum of odd digits - sum of even digits
 * 
 * input : "te1ch2no3cre7dits" output : 9
 * 
 * input : "4563" output : -2
 */