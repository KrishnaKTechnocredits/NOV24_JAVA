package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 54 : 18th Dec'2024
 * 
 * Return the array having elements in reverse order of original array.
 */

public class Assignment54 {

	int[] getReverseArray(int[] input) {
		int[] output = new int[input.length];

		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment54 assignment54 = new Assignment54();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		int[] reverseArray = assignment54.getReverseArray(input);
		System.out.println("Original Array Is - " + Arrays.toString(input));
		System.out.println("Reversed Array Is - " + Arrays.toString(reverseArray));
	}
}