package Assignment_Array;

import java.util.Arrays;

public class Assignment56 {

	int[] getArrayWithMaximumIndex(int[] num1, int[] num2) {

		int[] output = new int[Math.max(num1.length, num2.length)];

		for (int i = 0; i < num1.length; i++) {
			output[i] = num1[i];
		}

		for (int i = 0; i < num2.length; i++) {
			if (i < num1.length && num1[i] < num2[i]) {
				output[i] = num2[i];
			} else if (i >= num1.length) {
				output[i] = num2[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] num1 = { 10, 55, 22, 77, 22 };
		int[] num2 = { 5, 102, 28, 77, 18 };
		int[] output = new Assignment56().getArrayWithMaximumIndex(num1, num2);
		System.out.println(Arrays.toString(output));
	}
}
