//
//🔹 Assignment 102: Reverse a Number Without Using Strings  [My time : 10min]
//📥 Input: 321
//📤 Output: 123

package komal.Array;

public class Assignment102 {

	int getReverseString(int num) {
		int rev = 0;
		while (num > 0) {

			rev = rev * 10 + (num % 10);
			num = num / 10;
		}

		return rev;
	}

	public static void main(String args[]) {

		int number = 321;
		int num = new Assignment102().getReverseString(number);
		System.out.println("revrese number : " + num);
	}

}
