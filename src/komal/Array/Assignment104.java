//🔹 Assignment 104: Check for Armstrong Number
//📥 Input: 153
//✅ 153 is an Armstrong number sum of cube of single digit is should be 153 [myTime 10min]

package komal.Array;

public class Assignment104 {
	int checkArmstrongNumber(int num) {

		int sum = 0, rem = 0;

		while (num > 0) {

			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		return sum;
	}

	public static void main(String args[]) {

		int number = 153;
		int sum = new Assignment104().checkArmstrongNumber(number);
		if (number == sum) {
			System.out.println(number + " ArmstrongNumber ");
		}
	}

}
