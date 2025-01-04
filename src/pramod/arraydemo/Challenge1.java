/*
Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};

[12 mins]
*/

package pramod.arraydemo;

import java.util.*;

class Challenge1 {

	void printSumOfOtherElement(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				sum = sum + input[j];
			}
			output[i] = sum - input[i];
		}
		System.out.println("Sum of all other element :" + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Challenge1 ch1 = new Challenge1();
		int[] input = { 3, 5, 7, 1, 9 };
		System.out.println("Given elements :" + Arrays.toString(input));
		ch1.printSumOfOtherElement(input);

	}
}
