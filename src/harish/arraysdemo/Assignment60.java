package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 60 : 21st Dec'2024
 * 
 * Return second maximum number from given array.
 * 
 * input = {33,33,19,55,53,11}; output : 53
 */

public class Assignment60 {

	int getSecondMaxNumber(int[] input) {

		// Handle edge cases
		if (input == null || input.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements.");
		}

		int maxNumber = input[0];
		int secondMaxNumber = input[1];

		if (input[1] > input[0]) {
			maxNumber = input[1];
			secondMaxNumber = input[0];
		}

		for (int i = 2; i < input.length - 1; i++) {
			if (input[i] > maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = input[i];
			} else if (input[i] > secondMaxNumber) {
				secondMaxNumber = input[i];
			}
		}

		return secondMaxNumber;
	}

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		int[] input = { 33, 33, 19, 55, 53, 11 };
		System.out.println("Given array - " + Arrays.toString(input));
		try {
			System.out.println("Second max number = " + assignment60.getSecondMaxNumber(input));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		int[] input2 = { 1, 1, 1 };
		System.out.println("Given array - " + Arrays.toString(input2));
		try {
			System.out.println("Second max number = " + assignment60.getSecondMaxNumber(input2));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		int[] input3 = {};
		System.out.println("Given array - " + Arrays.toString(input3));
		try {
			System.out.println("Second max number = " + assignment60.getSecondMaxNumber(input3));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}