/* Assignment - 30 : 2nd Dec'2024 [15 mins]

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10   */

package amruta.String;

public class Assign_30_SumOfEvenDigitPresentInString {

	void printSumOfEvenDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0)
					sum += num;
			}
		}
		System.out.println("Sum of even digits available in String - " + str + " is --> " + sum);
	}

	public static void main(String[] args) {
		Assign_30_SumOfEvenDigitPresentInString a30 = new Assign_30_SumOfEvenDigitPresentInString();
		a30.printSumOfEvenDigits("te1ch2no3cre7dits");
		a30.printSumOfEvenDigits("techno");
		a30.printSumOfEvenDigits("4563");
	}
}
