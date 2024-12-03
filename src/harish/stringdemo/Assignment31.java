/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 31 : 2nd Dec'2024 [15 mins]
 * 
 * Return the difference of Sum of all the odd digits and even digits present in
 * a given String.
 * 
 * HINT : sum of odd digits - sum of even digits
 * 
 * Time Taken - 10 minutes
 */
public class Assignment31 {

	private int getOddEvenSumDifference(String str) {
		int sumOfEvenDigits = 0;
		int sumOfOddDigits = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (Character.getNumericValue(str.charAt(i)) % 2 == 0) {
					sumOfEvenDigits += Character.getNumericValue(str.charAt(i));
				} else {
					sumOfOddDigits += Character.getNumericValue(str.charAt(i));
				}
			}
		}
		System.out.println("Sum of even digits in string " + str + " is = " + sumOfEvenDigits);
		System.out.println("Sum of odd digits in string " + str + " is = " + sumOfOddDigits);
		return sumOfOddDigits - sumOfEvenDigits;
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String input = "te1ch2no3cre7dits";
		int oddEvenSumDifference = assignment31.getOddEvenSumDifference(input);
		System.out.println(
				"The difference in sum of odd and even digits in string " + input + " is = " + oddEvenSumDifference + "\n");

		input = "4563";
		oddEvenSumDifference = assignment31.getOddEvenSumDifference(input);
		System.out.println(
				"The difference in sum of odd and even digits in string " + input + " is = " + oddEvenSumDifference);
	}

}
