/* Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18  */

package amruta.String;

public class Assign_25_SumOfDigitPresentInString {

	void printSumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		System.out.println("Sum of digits available in String - " + str + " is --> " + sum);
	}

	public static void main(String[] args) {
		Assign_25_SumOfDigitPresentInString a25 = new Assign_25_SumOfDigitPresentInString();
		a25.printSumOfDigits("te1ch2no3cre7dits");
		a25.printSumOfDigits("techno");
		a25.printSumOfDigits("4563");
	}
}
