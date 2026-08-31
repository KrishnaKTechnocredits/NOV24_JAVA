package pranita;

import java.util.Arrays;

class Assignment60 {

	int getSecondMaxNumber(int[] input) {
		int maxNum = input[0], secondMax = input[1];
		if (maxNum < secondMax) {
			maxNum = secondMax;
			secondMax = input[0];
		}
		for (int i = 1; i < input.length; i++) {
			if (maxNum < input[i]) {
				secondMax = maxNum;
				maxNum = input[i];
			} else if (secondMax < input[i]) {
				secondMax = input[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		Assignment60 A60 = new Assignment60();
		int[] input = { 33, 33, 19, 55, 53, 11 };
		System.out.println("Given array is : " + Arrays.toString(input));
		int output = A60.getSecondMaxNumber(input);
		System.out.println("Second Maximum number is : " + output);
	}
}
