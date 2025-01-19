package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 49 : 16th Dec'2024
 * 
 * Return the maximum number from given array (using 2 for loops)
 * 
 * input : {44,45,22,25,47,29,46} output : 47
 * 
 * input : {-44,-45,-22,-25,-47,-29,-46} output : -22
 */

public class Assignment49 {

	int getMaxNumber(int[] input) {
		int maxNum = input[0];

		// Outer loop to iterate through the array elements
		for (int i = 0; i < input.length; i++) {
			// Inner loop to compare the current element with the maximum
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] > maxNum) {
					maxNum = input[j]; // Update max if a larger number is found
				}
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] input1 = { 44, 45, 22, 25, 47, 29, 46 };
		System.out.println("In the given array " + Arrays.toString(input1) + " Max Number is = "
				+ assignment49.getMaxNumber(input1));

		int[] input2 = { -44, -45, -22, -25, -47, -29, -46 };
		System.out.println("In the given array " + Arrays.toString(input2) + " Max Number is = "
				+ assignment49.getMaxNumber(input2));
	}
}