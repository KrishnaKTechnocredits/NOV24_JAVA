package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 73 : 6th Jan'2024
 * 
 * Shift all the zeros at the begining of an array.
 * 
 * Input : int[] arr = {5,0,22,44,0,0,55,0,12,19};
 * 
 * Output : {0,0,0,0,5,22,44,55,12,19}
 */

public class Assignment73 {

	// method which counts the occurrence of given number in the given array
	private static int getCountOfGivenNumber(int[] input, int num) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == num) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println("Input : " + Arrays.toString(arr));

		// initialize a new output array of same size as input array, all initial
		// numbers will be 0
		int[] output = new int[arr.length];
		// count number of zeros in the given input array
		int countOfZeros = Assignment73.getCountOfGivenNumber(arr, 0);
		// initialize current index with the correct position to insert remaining
		// numbers
		int currentIndex = countOfZeros;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[currentIndex] = arr[i];
				currentIndex++;
			}
		}
		System.out.println("Output : " + Arrays.toString(output));
	}
}