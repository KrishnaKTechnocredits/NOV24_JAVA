package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 74 : 8th Jan
 * 
 * Rotate all the numbers of an array to the right by one position.
 * 
 * input : {10,20,30,40,50}
 * 
 * output : {50,10,20,30,40}
 */

public class Assignment74 {

	int[] rotateArrayToRight(int[] input) {
		int[] output = new int[input.length];
		output[0] = input[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			output[i] = input[i - 1];
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		int[] input = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(input));
		int[] rotateArrayToRight = assignment74.rotateArrayToRight(input);
		System.out.println(Arrays.toString(rotateArrayToRight));
	}
}