package prem;

import java.util.Arrays;

public class Assignment54 {

	int[] getReturnReverseOrder(int[] digit) {
		int[] reverseDigit = new int[digit.length];
		for (int i = digit.length - 1, j = 0; i >= 0; i--, j++) {
			reverseDigit[j] = digit[i];
		}
		return reverseDigit;
	}

	public static void main(String[] args) {
		Assignment54 assign54 = new Assignment54();
		int[] digit = { 10, 34, 22, 16, 19, 99 };
		int[] ans = assign54.getReturnReverseOrder(digit);
		System.out.println(Arrays.toString(ans));
	}
}
