package anuja.string;

/*return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2
*/

public class Assignment31 {

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();

		String str1 = "te1ch2no3cre7dits";
		int resultDiff = assignment31.getDiffSum(str1);
		System.out.println(
				"Difference of even sum and odd sum of digits from string " + str1 + " --> " + resultDiff + " \n");

		String str2 = "4563";
		int resultDiff2 = assignment31.getDiffSum(str2);
		System.out.println(
				"Difference of even sum and odd sum of digits from string " + str2 + " --> " + resultDiff2 + " \n");
	}

	public int getDiffSum(String str) {
		int difference = 0;
		int evenSum = 0;
		int oddSum = 0;
		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num = Character.getNumericValue(str.charAt(i));

				if (num % 2 == 0) {
					evenSum = num + evenSum;
				}

				else {

					oddSum = num + oddSum;
				}

			}

			difference = oddSum - evenSum;
		}

		return difference;

	}

}
