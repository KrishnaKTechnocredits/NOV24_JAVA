/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment - 30 : 2nd Dec'2024
 * 
 * Sum of all the even digits present in a given String.
 * 
 * Time Taken - 5 minutes
 */
public class Assignment30 {

	private int sumOfEvenDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) && Character.getNumericValue(str.charAt(i)) % 2 == 0) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		String input = "te1ch2no3cre7dits";
		int sumOfEvenDigits = assignment30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);

		input = "techno";
		sumOfEvenDigits = assignment30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);

		input = "4563";
		sumOfEvenDigits = assignment30.sumOfEvenDigits(input);
		System.out.println("The sum of even digits in given string " + input + " is = " + sumOfEvenDigits);
	}
}
