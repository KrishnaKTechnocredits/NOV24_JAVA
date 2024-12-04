/*Assignment - 30 : 2nd Dec'2024 [15 mins]--15 min

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/

package prashant;

public class Assignment30 {
	
	int sumOfEvenDigits(String input) {
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if (digit % 2 == 0) {
					sum = sum + digit;

				}
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		Assignment30 assignment30 = new Assignment30();
		int answer = assignment30.sumOfEvenDigits("te1ch2no3cre7dits");
		System.out.println(answer);

		int answer1 = assignment30.sumOfEvenDigits("techno");
		System.out.println(answer1);

		int answer2 = assignment30.sumOfEvenDigits("4563");
		System.out.println(answer2);
	}


}
