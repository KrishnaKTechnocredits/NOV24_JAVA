package roshan.IMpNumberlogic;

public class Armstrong104 {
	void getArmstrongNumber(int[] num) {

		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			int num1 = num[i];// - A working copy of the number (so you can break it down digit by digit).

			int orignalnum = num1; // The original number (so you can compare at the end).

			while (num1 != 0) {
				int fdigit = num1 % 10;
				sum = sum + (fdigit * fdigit * fdigit);
				num1 = num1 / 10;

			}
			if (sum == orignalnum) {
				System.out.println(orignalnum + " is an Armstrong number");
			} else {
				System.out.println(orignalnum + " is not an Armstrong number");
			}

		}

	}

	public static void main(String[] args) {
		int[] num = { 153, 123 };
		Armstrong104 armstrong = new Armstrong104();
		armstrong.getArmstrongNumber(num);

	}
}



/*
 * 🔹 Assignment 104: Check for Armstrong Number 📥 Input: 153 ✅ 153 is an
 * Armstrong numberx 📥 Input: 123 ❌ 123 is not an Armstrong number 💡 Hint: An
 * Armstrong number is one where the sum of each digit raised to the power of
 * the number of digits equals the original number
 */

/*
 * Start - num1 = 153 - originalnum = 153 - sum = 0
 * 
 * First loop iteration - fdigit = num1 % 10 = 153 % 10 = 3 - Cube digit: 3^3=27
 * - Add to sum: sum = 0 + 27 = 27 - Divide number: num1 = 153 / 10 = 15
 * 
 * Second loop iteration - fdigit = 15 % 10 = 5 - Cube digit: 5^3=125 - Add to
 * sum: sum = 27 + 125 = 152 - Divide number: num1 = 15 / 10 = 1
 * 
 * Third loop iteration - fdigit = 1 % 10 = 1 - Cube digit: 1^3=1 - Add to sum:
 * sum = 152 + 1 = 153 - Divide number: num1 = 1 / 10 = 0
 * 
 * End of loop - num1 = 0 (the working copy is gone) - sum = 153 - Compare: sum
 * == originalnum → 153 == 153 → Armstrong number
 */
