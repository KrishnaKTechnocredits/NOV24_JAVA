package harish.test2january;

import java.util.Arrays;

/**
 * Challenge - 1: 2nd Jan 2025 [Time taken - 4 minutes]
 * 
 * Replace each element in the array with the sum of all other elements in the
 * array. The resulting array should be stored in a new array output.
 * 
 * Example:
 * 
 * Input: int[] input = {3, 5, 7, 1, 9};
 * 
 * Output: int[] output = {22, 20, 18, 24, 16};
 */

public class Challenge1 {

	// method to return an array containing sum of all other elements
	public int[] getSumOfAllOtherElements(int[] input) {
		int[] output = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				if (j != i) {
					sum += input[j];
				}
			}
			output[i] = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		Challenge1 challenge1 = new Challenge1();
		int[] input = { 3, 5, 7, 1, 9 };
		System.out.println("Original array is - " + Arrays.toString(input));
		int[] sumOfAllOtherElements = challenge1.getSumOfAllOtherElements(input);
		System.out.println("Array with sum of all other elements - " + Arrays.toString(sumOfAllOtherElements));
	}
}