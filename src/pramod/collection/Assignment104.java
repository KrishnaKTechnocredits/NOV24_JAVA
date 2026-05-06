/*🔹 Assignment 104: Check for Armstrong Number
📥 Input: 153
✅ 153 is an Armstrong number

📥 Input: 123
❌ 123 is not an Armstrong number

💡 Hint: An Armstrong number is one where the sum of each digit raised to the power of the number of digits equals the original number.
*/

package pramod.collection;

public class Assignment104 {

	void findNumberIsArmstrong(int num) {
		int originalNum = num;
		double output = 0;

		String str = "";
		str = str + num;
		int count = str.length();

		while (num > 0) {
			double digit = num % 10;
			output = output + (Math.pow(digit, count));
			num = num / 10;
		}
		if (originalNum == output) {
			System.out.println(originalNum + " is Armstrong number");
		} else {
			System.out.println(originalNum + " is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		int num1 = 153;
		int num2 = 9474;
		int num3 = 123;
		new Assignment104().findNumberIsArmstrong(num1);
		new Assignment104().findNumberIsArmstrong(num2);
		new Assignment104().findNumberIsArmstrong(num3);
	}
}
