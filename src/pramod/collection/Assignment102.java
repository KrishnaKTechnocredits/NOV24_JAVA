/*🔹 Assignment 102: Reverse a Number Without Using Strings
📥 Input: 321
📤 Output: 123
*/
package pramod.collection;

import java.util.Scanner;

public class Assignment102 {

	void printReverseNumber(int num) {

		int reverseNum = 0;
		while (num > 0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		System.out.print("Reverse number is:" + reverseNum);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number which you want to reverse:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		new Assignment102().printReverseNumber(num);
		sc.close();
	}
}
