/*
 * Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}

 */

package rohan;

import java.util.Arrays;

public class Assignment_72 {

	public static void main(String[] args) {
		Assignment_72 assignment = new Assignment_72();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		int[] output = assignment.ShiftZeroEnd(arr);
		System.out.println("outout : " + Arrays.toString(output));
	}

	int[] ShiftZeroEnd(int[] arr) {
		int[] output = new int[arr.length];
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {
				output[i] = arr[j];
				i++;
			}
		}
		return output;
	}

}
