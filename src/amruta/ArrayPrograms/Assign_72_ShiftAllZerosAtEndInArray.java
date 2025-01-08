/*
 * Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}
 */

package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_72_ShiftAllZerosAtEndInArray {

	void shiftAllZerosToEnd(int[] arr) {
		int[] output = new int[arr.length];
		
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println("Array after shifting all zeros at the end --> " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println("Original Array --> " + Arrays.toString(arr));
		new Assign_72_ShiftAllZerosAtEndInArray().shiftAllZerosToEnd(arr);
	}
}
