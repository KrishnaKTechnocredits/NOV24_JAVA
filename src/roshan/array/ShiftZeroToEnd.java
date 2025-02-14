package roshan.array;

import java.util.Arrays;

public class ShiftZeroToEnd {

	int[] getZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0, j = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++; // add j++ here not in for loop

			}

		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		ShiftZeroToEnd shiftzerotoend = new ShiftZeroToEnd();
		int[] result = shiftzerotoend.getZeroAtEnd(input);
		System.out.println(Arrays.toString(result));

	}

}

/*
 * Assignment - 72 : 6th Jan'2024 Shift all the zeros at the end of an array.
 * 
 * int[] arr = {5,0,22,44,0,0,55,0,12,19}; output : {5,22,44,55,12,19,0,0,0,0}
 */
