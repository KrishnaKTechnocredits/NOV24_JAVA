package roshan.array;

import java.util.Arrays;

public class ShiftZerToStart {
	int[] GetAllZeroToStart(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0, j = 4; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		ShiftZerToStart shiftzertostart = new ShiftZerToStart();
		int[] result = shiftzertostart.GetAllZeroToStart(input);
		System.out.println(Arrays.toString(result));

	}
}

/*
 * Assignment - 73 : 6th Jan'2024
 * 
 * Shift all the zeros at the begining of an array.
 * 
 * int[] arr = {5,0,22,44,0,0,55,0,12,19}; output : {0,0,0,0,5,22,44,55,12,19}
 */