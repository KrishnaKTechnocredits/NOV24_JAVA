/*Assignment - 31 : 2nd Dec'2024 [15 mins]--9 min

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2*/

package prashant;

public class Assignment31 {
	
	int differenceOfSum(String input) {
		int difference = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if (digit % 2 == 0) {

					evenSum = evenSum + digit;
				} else {
					oddSum = oddSum + digit;
				}

			}

		}

		difference = oddSum - evenSum;
		return difference;
	}

	public static void main(String[] args) {

		Assignment31 assignment31 = new Assignment31();
		int answer = assignment31.differenceOfSum("te1ch2no3cre7dits");
		System.out.println(answer);

		int answer1 = assignment31.differenceOfSum("4563");
		System.out.println(answer1);

	}

}
