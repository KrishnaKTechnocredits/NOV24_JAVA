package harish.stringdemo;

/**
 * Assignment - 25 : 2nd Dec'2024
 * 
 * Sum of all the digits present in a given String.
 * 
 * Time Taken - 5 minutes
 */

public class Assignment25 {

	private int getSumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Assignment25 assignment25 = new Assignment25();
		String str = "te1ch2no3cre7dits";
		int sumOfDigits = assignment25.getSumOfDigits(str);
		System.out.println("The sum of digits in given String " + str + " is " + sumOfDigits);

	}
}
