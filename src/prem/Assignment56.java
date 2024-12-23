package prem;

import java.util.Arrays;

public class Assignment56 {

	int[] getMaxIndex(int[] input, int[] input1) {
		int[] output = new int[input.length];
		for (int i = 0; i <= output.length - 1; i++) {
			if (input[i] >= input1[i]) {
				output[i] = input[i];
			} else if (input[i] <= input1[i]) {
				output[i] = input1[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment56 assign56 = new Assignment56();
		int[] input = { 10, 55, 22, 77, 88 };
		int[] input1 = { 5, 102, 28, 77, 18 };
		int[] maxOutput = assign56.getMaxIndex(input, input1);
		System.out.println(Arrays.toString(maxOutput));
	}
}
