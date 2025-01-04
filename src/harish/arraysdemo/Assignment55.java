package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 55 : 18th Dec'2024
 * 
 * Return union of given two array.
 * 
 * input : {10,19,18} {99,8}
 * 
 * output : {10,19,18,99,8}
 */

public class Assignment55 {

	int[] getUnionOfArrays(int[] input1, int[] input2) {
		int[] output = new int[input1.length + input2.length];
		int currentIndex = 0;
		for (int i = 0; i < input1.length; i++) {
			output[currentIndex] = input1[i];
			currentIndex++;
		}
		for (int i = 0; i < input2.length; i++) {
			output[currentIndex] = input2[i];
			currentIndex++;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		int[] input1 = { 10, 19, 18 };
		int[] input2 = { 99, 8 };
		System.out.println("Given arrays 1 and 2 are - " + Arrays.toString(input1) + " " + Arrays.toString(input2));
		System.out.println("Union of 2 arrays is - " + Arrays.toString(assignment55.getUnionOfArrays(input1, input2)));
	}
}