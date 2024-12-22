package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 56 : 20th Dec'2024
 * 
 * Return the array having maximum number from each index of given two arrays.
 * 
 * input : {10,55,22,77,88} {5,102,28,77,18}
 * 
 * output : [10,102,28,77,88]
 * 
 * NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
 */

public class Assignment56_2 {

	int[] getMaxNumFromTwoArrays(int[] arr1, int[] arr2) {
		// Check if arrays have different lengths
		if (arr1.length != arr2.length) {
			throw new IllegalArgumentException("Arrays must have the same length for comparision");
		}

		int[] output = new int[arr1.length];

		// Compare each element of the two arrays and store the max in the output array
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] > arr2[i]) {
				output[i] = arr1[i];
			} else {
				output[i] = arr2[i];
			}
		}

		return output;
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 55, 22, 77, 88 };
		int[] input2 = { 5, 102, 28, 77 };

		Assignment56_2 assignment56_2 = new Assignment56_2();

		System.out.println("Given Input Arrays -\n" + Arrays.toString(input1) + "\n" + Arrays.toString(input2));

		try {
			int[] maxNumFromTwoArrays = assignment56_2.getMaxNumFromTwoArrays(input1, input2);
			System.out.println("Array having maximum number from each index of given two arrays - ");
			System.out.println(Arrays.toString(maxNumFromTwoArrays));
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}